package com.pe.devcode.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("perroCaliente")
public class PerroCaliente{
	
	private String tipo;
	private Double precio;
	private Pan pan;
	
//	@Autowired
	private Salsa salsa;
	
//	@Autowired
//	@Qualifier("salchichaAlemana")
	private Salchicha salchicha;
	
	public PerroCaliente() {
	}

	public PerroCaliente(String tipo, Double precio, Pan pan, Salsa salsa, Salchicha salchicha) {
		this.tipo = tipo;
		this.precio = precio;
		this.pan = pan;
		this.salsa = salsa;
		this.salchicha = salchicha;
	}

	@Autowired
	public PerroCaliente(@Qualifier("panPerro")Pan pan, Salsa salsa, @Qualifier("salchichaPolaca") Salchicha salchicha) {
		this.pan = pan;
		this.salsa = salsa;
		this.salchicha = salchicha;
	}	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

//	@Autowired
//	@Qualifier("panPerro")
	public void setPan(Pan pan) {
		this.pan = pan;
	}

	public Salsa getSalsa() {
		return salsa;
	}

	public void setSalsa(Salsa salsa) {
		this.salsa = salsa;
	}

	public Salchicha getSalchicha() {
		return salchicha;
	}

	public void setSalchicha(Salchicha salchicha) {
		this.salchicha = salchicha;
	}

	@Override
	public String toString() {
		return "PerroCaliente [tipo=" + tipo + ", precio=" + precio + ", pan=" + pan + ", salsa=" + salsa
				+ ", salchicha=" + salchicha + "]";
	}
	
	
}
