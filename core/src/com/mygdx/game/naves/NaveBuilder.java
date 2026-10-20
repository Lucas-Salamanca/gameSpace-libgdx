package com.mygdx.game.naves;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.disparos.BulletStrategy;

// Builder de naves: define los pasos para construir una nave.
// Cada tipo de nave implementa esta interfaz con su propio builder.
public interface NaveBuilder {
    NaveBuilder posicion(int x, int y);                     // posición inicial
    NaveBuilder sprite(Texture tx);                         // imagen de la nave
    NaveBuilder sonidoHerido(Sound sonido);                 // sonido al ser herida
    NaveBuilder bala(Texture txBala, Sound soundBala);      // imagen y sonido de las balas
    NaveBuilder estrategiaDisparo(BulletStrategy estrategia); // movimiento de las balas
    NaveBuilder vidas(int vidas);                           // cantidad de vidas
    NaveBuilder velocidad(float velocidad);                 // velocidad de movimiento
    NaveBuilder tiempoHeridoMax(int tiempo);                // duración del estado herido
    Nave4 build();                                          // entrega la nave terminada
}
