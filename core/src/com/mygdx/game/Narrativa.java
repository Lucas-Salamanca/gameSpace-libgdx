package com.mygdx.game;

public class Narrativa {
	private String mensaje;
	private int scoreMinimo;
	private int scoreMaximo;

	public Narrativa( int scoreMinimo, int scoreMaximo,String mensaje) {
		this.scoreMinimo = scoreMinimo;
		this.scoreMaximo = scoreMaximo;
		this.mensaje = mensaje;
	}
	public String getMensaje() {
		return mensaje;
	}
	public int getScoreMinimo() {
		return scoreMinimo;
	}
	public int getScoreMaximo() {
		return scoreMaximo;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public void setScoreMinimo(int scoreMinimo) {
		this.scoreMinimo = scoreMinimo;
	}
	public void setScoreMaximo(int scoreMaximo) {
		this.scoreMaximo = scoreMaximo;
	}
	
	public boolean corresponde(int score) {
		if(score >= scoreMinimo && score <= scoreMaximo) {
			return true;
		}
		return false;
	}
}
