package com.uce.edu.demo.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.ventas.repository.ICancionRepository;
import com.uce.edu.demo.ventas.repository.modelo.Cancion;

@Service
public class CancionServiceImpl implements ICancionService{

	@Autowired
	private ICancionRepository cancionRepository;
	
	@Override
	public void guardar(Cancion cancion) {
		this.cancionRepository.insertar(cancion);
		
	}
	

}
