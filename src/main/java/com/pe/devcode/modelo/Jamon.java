package com.pe.devcode.modelo;

public class Jamon {
	private String tipo;
	private String marca;
	
	public Jamon() {
	}

	public Jamon(String tipo, String marca) {
		super();
		this.tipo = tipo;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Jamon [tipo=" + tipo + ", marca=" + marca + "]";
	}
}
