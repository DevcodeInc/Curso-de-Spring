package com.pe.devcode.modelo;

public class Pan{
	
	private String tipoPan;
	private String marca;
	private Boolean fresco;
	private Integer panesUsados;
 	
	public Pan() {
	}

	public Pan(String tipoPan, String marca,Integer panesUsados, Boolean fresco) {
		this.tipoPan = tipoPan;
		this.marca = marca;
		this.fresco = fresco;
		this.panesUsados = panesUsados;
	}

	public String getTipoPan() {
		return tipoPan;
	}

	public void setTipoPan(String tipoPan) {
		this.tipoPan = tipoPan;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Boolean getFresco() {
		return fresco;
	}

	public void setFresco(Boolean fresco) {
		this.fresco = fresco;
	}

	public Integer getPanesUsados() {
		return panesUsados;
	}

	public void setPanesUsados(Integer panesUsados) {
		this.panesUsados = panesUsados;
	}

	@Override
	public String toString() {
		return "Pan [tipoPan=" + tipoPan + ", marca=" + marca + ", fresco=" + fresco + ", panesUsados=" + panesUsados
				+ "]";
	}
}
