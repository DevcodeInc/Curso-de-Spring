package com.pe.devcode.modelo;

public class Salsa{
	
	private String marca;
	private String tipo;
	
	public Salsa() {
	}

	public Salsa(String marca, String tipo) {
		super();
		this.marca = marca;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Salsa [marca=" + marca + ", tipo=" + tipo + "]";
	}
	
	
}
