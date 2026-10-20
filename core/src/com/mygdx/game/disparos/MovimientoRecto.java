package com.mygdx.game.disparos;

public class MovimientoRecto implements BulletStrategy
{
    private final float xSpeed;
    private final float ySpeed;

    public MovimientoRecto(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void update(Bullet bullet, float delta)
    {
        /* Calcular nueva posicion de la bala */
        float nuevaX = bullet.getX() + (xSpeed * delta);
        float nuevaY = bullet.getY() + (ySpeed * delta);

        /* Actualizar posicion de la bala */
        bullet.setPosition(nuevaX, nuevaY);
    }
}