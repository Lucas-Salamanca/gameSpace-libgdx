package com.mygdx.game;

import java.util.ArrayList;

public class ControladorNarrativa {
	private ArrayList<Narrativa> narrativa = new ArrayList<>();
	
	public ControladorNarrativa() {
		narrativa.add(new Narrativa(0,0,"Buscando señales de rescate... Sin resultados"));
		narrativa.add(new Narrativa(50,60,"Fragmento recurepado: \n"
					+ "'...la flota principal fue destruida en el sector 4...'"));
		narrativa.add(new Narrativa(100,110,"Fragmento recuperado: \n"
				+ "'...el artefacto enemigo no debe caer en manos de la federacion...'"));
		narrativa.add(new Narrativa(150,160,"Archivo descifrado por completo: \n"
					+ "'Tu eres la ultima esperanza de la base estelar, Sobrevive"));
	}
	
	public String entregarMensaje(int score) {
		for(Narrativa i : narrativa) {
			if(i.corresponde(score)) {
				return i.getMensaje();
			}
		}
		return null;
	}
}
