package com.pe.devcode.modelo;

public class Sandwich {

	private Double precio;
	private Pan pan;
	private Salsa salsa;
	private Jamon jamon;
	private Queso queso;
	
	public Sandwich() {
	}

	public Sandwich(Double precio, Pan pan, Salsa salsa, Jamon jamon, Queso queso) {
		super();
		this.precio = precio;
		this.pan = pan;
		this.salsa = salsa;
		this.jamon = jamon;
		this.queso = queso;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	public Salsa getSalsa() {
		return salsa;
	}

	public void setSalsa(Salsa salsa) {
		this.salsa = salsa;
	}

	public Jamon getJamon() {
		return jamon;
	}

	public void setJamon(Jamon jamon) {
		this.jamon = jamon;
	}

	public Queso getQueso() {
		return queso;
	}

	public void setQueso(Queso queso) {
		this.queso = queso;
	}

	@Override
	public String toString() {
		return "Sandwich [precio=" + precio + ", pan=" + pan + ", salsa=" + salsa + ", jamon=" + jamon + ", queso="
				+ queso + "]";
	}
}
