package com.proyecto.panelazo.service;

import java.util.List;

import com.proyecto.panelazo.model.Orden;

public interface IOrdenService {
	
	List<Orden> findAll();
	Orden save(Orden orden);
	String generarNumeroOrden();

}
