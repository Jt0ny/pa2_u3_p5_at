package com.uce.edu.demo.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.ventas.repository.IFacturaRepository;
import com.uce.edu.demo.ventas.repository.modelo.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepository facturaRepository;
	@Override
	public Factura buscarPorNumero(String numero) {
		
		return this.facturaRepository.seleccionarPorNumero(numero);
	}

	@Override
	public void guardar(Factura factura) {
		this.facturaRepository.insertar(factura);
		
	}

	@Override
	public List<Factura> buscarFacturasInnerJoin() {
	
		return this.facturaRepository.seleccionarFacturasInnerJoin()
				;
	}

	@Override
	public List<Factura> buscarFacturasRightJoin() {
		
		return this.facturaRepository.seleccionarFacturasRightJoin();
	}

	@Override
	public List<Factura> buscarFacturasLeftJoin() {
		
		return this.facturaRepository.seleccionarFacturasLeftJoin();
	}

	@Override
	public List<Factura> buscarFacturasFulltJoin() {
		
		return this.facturaRepository.seleccionarFacturasFulltJoin();
	}

}
