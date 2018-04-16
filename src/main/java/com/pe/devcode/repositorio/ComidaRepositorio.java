package com.pe.devcode.repositorio;

import com.pe.devcode.modelo.Hamburguesa;
import com.pe.devcode.modelo.PerroCaliente;
import com.pe.devcode.modelo.Sandwich;

public interface ComidaRepositorio {
	
	Hamburguesa prepararHamburguesa();
	
	PerroCaliente prepararPerroCaliente();
	
	Sandwich prepararSandwich();
}
