package com.proyecto.panelazo.service;

import java.util.Optional;

import com.proyecto.panelazo.model.Usuario;

public interface IUsuarioService {
	
	Optional<Usuario> findById(Integer id);
	
}