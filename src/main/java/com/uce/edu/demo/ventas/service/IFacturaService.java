package com.uce.edu.demo.ventas.service;

import java.util.List;

import com.uce.edu.demo.ventas.repository.modelo.Factura;

public interface IFacturaService {
	
	public Factura buscarPorNumero(String numero);
	public void guardar(Factura factura);
	
	//
	public List<Factura> buscarFacturasInnerJoin();
	//
	public List<Factura> buscarFacturasRightJoin();
	//
	public List<Factura> buscarFacturasLeftJoin();
	//
	public List<Factura> buscarFacturasFulltJoin();
}
