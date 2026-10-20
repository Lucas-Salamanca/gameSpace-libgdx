package com.mygdx.game.PowerUps;

import com.mygdx.game.naves.Nave4;

public class Danio implements PowerUpsEffecto {
	private int cantDanio = 2;
	
	@Override
	public void aplicarEffecto(Nave4 nave) {
		int danioActual = nave.getDanio();
		nave.setDanio(danioActual + cantDanio);
	}
}
