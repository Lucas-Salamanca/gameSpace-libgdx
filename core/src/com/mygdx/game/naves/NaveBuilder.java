package com.mygdx.game.naves;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.disparos.BulletStrategy;

public interface NaveBuilder {
    NaveBuilder posicion(int x, int y);
    NaveBuilder sprite(Texture tx);
    NaveBuilder sonidoHerido(Sound sonido);
    NaveBuilder bala(Texture txBala, Sound soundBala);
    NaveBuilder estrategiaDisparo(BulletStrategy estrategia);
    NaveBuilder vidas(int vidas);
    NaveBuilder velocidad(float velocidad);
    NaveBuilder tiempoHeridoMax(int tiempo);
    Nave4 build();
}
