package com.mygdx.game;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;


public class Bullet
{
	private int xSpeed;
	private int ySpeed;
	private boolean destroyed = false;
	private Sprite spr;
<<<<<<< HEAD

	public Bullet(float x, float y, int xSpeed, int ySpeed, Texture tx)
	{
		spr = new Sprite(tx);
		spr.setPosition(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void update()
	{
		/* Actualizar posicion del la bala */
		spr.setPosition(spr.getX() + xSpeed, spr.getY() + ySpeed);

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
=======
	    
	    public Bullet(float x, float y, int xSpeed, int ySpeed, Texture tx) {
	    	spr = new Sprite(tx);
	    	spr.setPosition(x, y);
	        this.xSpeed = xSpeed;
	        this.ySpeed = ySpeed;
	    }
	    public void update() {
	        spr.setPosition(spr.getX()+xSpeed, spr.getY()+ySpeed);
	        if (spr.getX() < 0 || spr.getX()+spr.getWidth() > 1200) {
	            destroyed = true;
	        }
	        if (spr.getY() < 0 || spr.getY()+spr.getHeight() > 800) {
	        	destroyed = true;
	        }
	        
	    }
	    
	    public void draw(SpriteBatch batch) {
	    	spr.draw(batch);
	    }
	    
	    public boolean checkCollision(Enemigos b2) {
	        if(spr.getBoundingRectangle().overlaps(b2.getArea())){
	        	// Se destruyen ambos
	            this.destroyed = true;
	            return true;
>>>>>>> aff5cf6d59da3907053bbe24282006b33d1c3736
	
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
	
	public boolean isDestroyed() { return destroyed; }
	
	public Rectangle getArea()
	{
		return spr.getBoundingRectangle();
	}

	public void setDestruido(boolean destruido)
	{
		this.destroyed = destruido;
	}
}
