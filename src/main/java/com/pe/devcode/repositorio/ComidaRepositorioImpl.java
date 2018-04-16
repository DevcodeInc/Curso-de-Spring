package com.pe.devcode.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.pe.devcode.modelo.Carne;
import com.pe.devcode.modelo.Hamburguesa;
import com.pe.devcode.modelo.Jamon;
import com.pe.devcode.modelo.Pan;
import com.pe.devcode.modelo.PerroCaliente;
import com.pe.devcode.modelo.Queso;
import com.pe.devcode.modelo.Salsa;
import com.pe.devcode.modelo.Sandwich;

@Repository("comidaRepositorio")
public class ComidaRepositorioImpl implements ComidaRepositorio{

	@Autowired
	@Qualifier("perroCaliente")
	PerroCaliente perroCaliente;
	
	@Autowired
	Queso queso;
	
	@Autowired
	@Qualifier("panSandwich") 
	Pan pan;
	
	@Autowired
	Salsa salsa;	
	
	@Autowired
	@Qualifier("jamonPavo") 
	Jamon jamonPavo;	
	
	@Autowired
	@Qualifier("quesoAmarillo") 
	Queso quesoAmarillo;	
	
	@Autowired
	Hamburguesa hamburguesa;
	
	@Override
	public Hamburguesa prepararHamburguesa() {
//		Hamburguesa hamburguesa = new Hamburguesa();
//		hamburguesa.setNombre("Big Mac");
//		hamburguesa.setPrecio(12d);
//		hamburguesa.setCarne(new Carne("120 lbs"));
//		hamburguesa.setPan(new Pan("Pan hambuguesa","Bimbo",1, true));
//		hamburguesa.setSalsa(new Salsa("Heinz","Tomate"));
		return this.hamburguesa;
	}

	@Override
	public PerroCaliente prepararPerroCaliente() {
		this.perroCaliente.setTipo("Jumbo");
		this.perroCaliente.setPrecio(8d);
		return this.perroCaliente;
	}

	@Override
	public Sandwich prepararSandwich() {
		Sandwich sandwich = new Sandwich(9d, this.pan, this.salsa, this.jamonPavo, this.quesoAmarillo);
		return sandwich;
	}
}
