package com.pe.devcode.modelo;

public class Queso {

	private String tipo;
	private String marca;
	
	public Queso() {
	}
	
	public Queso(String tipo, String marca) {
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
		return "Queso [tipo=" + tipo + ", marca=" + marca + "]";
	}
}
