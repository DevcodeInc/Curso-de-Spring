package com.pe.devcode.modelo;

public class Carne {
	private String tamano;
	
	public Carne() {
	}

	public Carne(String tamano) {
		super();
		this.tamano = tamano;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Carne [tamano=" + tamano + "]";
	}
}
