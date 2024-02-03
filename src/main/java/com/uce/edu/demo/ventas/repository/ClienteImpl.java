package com.uce.edu.demo.ventas.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.ventas.repository.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteImpl implements IClienteRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cliente cliente) {
		this.entityManager.persist(cliente);
		
	}

}
