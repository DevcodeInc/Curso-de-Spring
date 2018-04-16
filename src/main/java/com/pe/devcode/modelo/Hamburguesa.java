package com.pe.devcode.modelo;

public class Hamburguesa {

	private String nombre;
	private Double precio;
	private Pan pan;
	private Carne carne;
	private Salsa salsa;
	
	public Hamburguesa() {
	}
	
	public Hamburguesa(String nombre, Double precio, Pan pan, Carne carne, Salsa salsa) {
		this.nombre = nombre;
		this.precio = precio;
		this.pan = pan;
		this.carne = carne;
		this.salsa = salsa;
	}
	
	public Hamburguesa(Pan pan, Carne carne, Salsa salsa) {
		this.pan = pan;
		this.carne = carne;
		this.salsa = salsa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Carne getCarne() {
		return carne;
	}

	public void setCarne(Carne carne) {
		this.carne = carne;
	}

	public Salsa getSalsa() {
		return salsa;
	}

	public void setSalsa(Salsa salsa) {
		this.salsa = salsa;
	}

	@Override
	public String toString() {
		return "Hamburguesa [nombre=" + nombre + ", precio=" + precio + ", pan=" + pan + ", carne=" + carne + ", salsa="
				+ salsa + "]";
	}
}
