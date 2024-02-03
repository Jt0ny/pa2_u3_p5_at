package com.uce.edu.demo.ventas.service;

import java.time.LocalDate;
import java.util.List;

import com.uce.edu.demo.ventas.repository.modelo.Cliente;
import com.uce.edu.demo.ventas.repository.modelo.Factura;
import com.uce.edu.demo.ventas.repository.modelo.dto.FacturaDTO;

public interface IFacturaService {
	
	public Factura buscarPorNumero(String numero);
	
	public void guardar(Factura factura,Cliente cliente);
	
	//
	public List<Factura> buscarFacturasInnerJoin();
	//
	public List<Factura> buscarFacturasRightJoin();
	//
	public List<Factura> buscarFacturasLeftJoin();
	//
	public List<Factura> buscarFacturasFulltJoin();
	//
	public List<Factura> buscarFacturasWheretJoin();
	//
	public List<Factura> buscarFacturasFetchJoin();
	//
	public int actualizarFechas(LocalDate fechaNueva,LocalDate fechaActual);
	//
	public  int borarPorNumero(String numero);
	//
	public void borrar(Integer id);
	//
	public List<FacturaDTO> buscarFactutrasDTO();
	
}
