package com.mygdx.game.disparos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import com.mygdx.game.Enemigos;

import java.util.HashSet;
import java.util.Set;

public class Bullet
{
	private EstrategiaMovimientoBala estrategiaMovimiento;
	private EstrategiaImpactoBala estrategiaImpacto;
	private boolean destroyed = false;
	private Sprite spr;
	private Set<Enemigos> enemigosImpactados = new HashSet();

	public Bullet(float x, float y, Texture tx, EstrategiaMovimientoBala estrategiaMovimiento, EstrategiaImpactoBala estrategiaImpacto)
	{
		this.spr = new Sprite(tx);
		this.spr.setPosition(x, y);

		this.estrategiaMovimiento = estrategiaMovimiento;
		this.estrategiaImpacto = estrategiaImpacto;
	}

	public void update(float delta)
	{
		/* Actualizar posicion del la bala */
		estrategiaMovimiento.update(this, delta);

		/* Verificar posicion de la bala en los limites del mundo */
		if (spr.getX() < 0 || spr.getX()+spr.getWidth() > 1200)	/* xPos */
		{
			destroyed = true;
		}
		if (spr.getY() < 0 || spr.getY()+spr.getHeight() > 800)	/* yPos */
		{
			destroyed = true;
		}
	}
	
	public void draw(SpriteBatch batch)
	{
		spr.draw(batch);
	}
	
	public boolean checkCollision(Enemigos b2)
	{
		/* Verificar si un enemigo es alcanzado por la bala */
		if(spr.getBoundingRectangle().overlaps(b2.getArea()) && !enemigosImpactados.contains(b2))
		{
			enemigosImpactados.add(b2);
			this.destroyed = estrategiaImpacto.destruirBalaImpacto();

			return true;
		}

		return false;
	}

	/* ===== GET ===== */
	public boolean isDestroyed() { return destroyed; }
	public Rectangle getArea() { return spr.getBoundingRectangle(); }
	public float getX() { return spr.getX(); }
	public float getY() { return spr.getY(); }

	/* ===== SET ===== */

	public void setDestruido(boolean destruido) { this.destroyed = destruido; }
	public void setPosition(float x, float y) { spr.setPosition(x, y); }
}
