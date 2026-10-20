package com.mygdx.game.disparos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import com.mygdx.game.Enemigos;

public class Bullet
{
	private BulletStrategy estrategia;
	private boolean destroyed = false;
	private Sprite spr;

	public Bullet(float x, float y, Texture tx, BulletStrategy estrategia)
	{
		this.spr = new Sprite(tx);
		this.spr.setPosition(x, y);

		this.estrategia = estrategia;
	}

	public void update(float delta)
	{
		/* Actualizar posicion del la bala */
		estrategia.update(this, delta);

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
		if(spr.getBoundingRectangle().overlaps(b2.getArea()))
		{
			this.destroyed = true;

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
