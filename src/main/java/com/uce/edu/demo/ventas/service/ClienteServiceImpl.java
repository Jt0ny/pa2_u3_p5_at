package com.uce.edu.demo.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.ventas.repository.IClienteRepository;
import com.uce.edu.demo.ventas.repository.modelo.Cliente;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ClienteServiceImpl implements IClienteService{

	
	@Autowired
	private IClienteRepository clienteRepository;

	@Override
	@Transactional(value=TxType.REQUIRES_NEW)//T2
	//begin
	public void guardar(Cliente cliente) {
	
		try {
			this.clienteRepository.insertar(cliente);
		} catch (RuntimeException e) {
			System.out.println("Error");
		}
		
	}
	//commit
	

}
