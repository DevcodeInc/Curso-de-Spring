package com.pe.devcode.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.devcode.modelo.Hamburguesa;
import com.pe.devcode.modelo.PerroCaliente;
import com.pe.devcode.modelo.Sandwich;
import com.pe.devcode.repositorio.ComidaRepositorio;

@Service("comidaServicio")
public class ComidaServicioImpl implements ComidaServicio{

	@Autowired
	private ComidaRepositorio comidaRepositorio;

	@Override
	public Hamburguesa prepararHamburguesa() {
		Hamburguesa hamburguesa= null;
		
		try {
			System.out.println("\nPreparancion de hamburguesa iniciada");
			hamburguesa = comidaRepositorio.prepararHamburguesa();
		}catch(Exception e) {
			
		}finally {
			System.out.println("Preparancion de hamburguesa finalizada");
		}
		return hamburguesa;
	}

	@Override
	public PerroCaliente prepararPerroCaliente() {
		PerroCaliente perroCaliente= null;
		
		try {
			System.out.println("\nPreparancion de Perro Caliente iniciada");
			perroCaliente = comidaRepositorio.prepararPerroCaliente();
		}catch(Exception e) {
			
		}finally {
			System.out.println("Preparancion de Perro Caliente finalizada");
		}
		return perroCaliente;		
	}

	@Override
	public Sandwich prepararSandwich() {
		Sandwich sandwich= null;
		
		try {
			System.out.println("\nPreparancion de Sandwich iniciada");
			sandwich = comidaRepositorio.prepararSandwich();
		}catch(Exception e) {
			
		}finally {
			System.out.println("Preparancion de Sandwich finalizada");
		}
		return sandwich;		
		
	}
}
