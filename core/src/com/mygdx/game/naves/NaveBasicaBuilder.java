package com.mygdx.game.naves;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.disparos.BulletStrategy;
import com.mygdx.game.disparos.MovimientoRecto;

public class NaveBasicaBuilder implements NaveBuilder {
    private int x, y;
    private Texture tx, txBala;
    private Sound sonidoHerido, soundBala;
    private int vidas = 5;
    private float velocidad = 300f;
    private int tiempoHeridoMax = 50;
    private BulletStrategy estrategia = new MovimientoRecto(0, 180);

    @Override public NaveBuilder posicion(int x, int y) { this.x = x; this.y = y; return this; }
    @Override public NaveBuilder sprite(Texture tx) { this.tx = tx; return this; }
    @Override public NaveBuilder sonidoHerido(Sound s) { this.sonidoHerido = s; return this; }
    @Override public NaveBuilder bala(Texture txBala, Sound soundBala) {
        this.txBala = txBala; this.soundBala = soundBala; return this;
    }
    @Override public NaveBuilder estrategiaDisparo(BulletStrategy e) { this.estrategia = e; return this; }
    @Override public NaveBuilder vidas(int v) { this.vidas = v; return this; }
    @Override public NaveBuilder velocidad(float v) { this.velocidad = v; return this; }
    @Override public NaveBuilder tiempoHeridoMax(int t) { this.tiempoHeridoMax = t; return this; }

    @Override
    public Nave4 build() {
        return new Nave4(x, y, tx, sonidoHerido, txBala, soundBala,
                         vidas, velocidad, tiempoHeridoMax, estrategia);
    }
}
