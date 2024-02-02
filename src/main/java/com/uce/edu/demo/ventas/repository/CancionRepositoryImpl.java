 package com.uce.edu.demo.ventas.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.ventas.repository.modelo.Cancion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CancionRepositoryImpl implements ICancionRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cancion cancion) {
		this.entityManager.persist(cancion);
	}

}
