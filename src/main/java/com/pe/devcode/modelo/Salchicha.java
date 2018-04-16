package com.pe.devcode.modelo;

//@Component("salchichaPolaca")
public class Salchicha {
	
	private String tipo;
	private String marca;
	
	public Salchicha() {
	}
	public Salchicha(String tipo, String marca) {
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
		return "Salchicha [tipo=" + tipo + ", marca=" + marca + "]";
	}
	
	
}
