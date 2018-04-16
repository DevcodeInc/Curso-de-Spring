package com.pe.devcode.servicio;

import com.pe.devcode.modelo.Hamburguesa;
import com.pe.devcode.modelo.PerroCaliente;
import com.pe.devcode.modelo.Sandwich;

public interface ComidaServicio {
	
	Hamburguesa prepararHamburguesa();
	
	PerroCaliente prepararPerroCaliente();
	
	Sandwich prepararSandwich();	
}
