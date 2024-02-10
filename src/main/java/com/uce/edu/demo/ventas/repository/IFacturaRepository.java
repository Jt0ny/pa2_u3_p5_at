package com.uce.edu.demo.ventas.repository;

import java.time.LocalDate;
import java.util.List;

import com.uce.edu.demo.ventas.repository.modelo.Factura;
import com.uce.edu.demo.ventas.repository.modelo.dto.FacturaDTO;

public interface IFacturaRepository {
	
	public Factura seleccionarPorNumero(String numero);
	public void insertar(Factura factura);
	
	public void actualizar (Factura factura);
	
	public int actualizarFechas(LocalDate fechaNueva,LocalDate fechaActual);
	
	public void eliminar(Integer id);
	
	public  int eliminarPorNumero(String numero);
	
	//1.1 Inner Join
	public List<Factura> seleccionarFacturasInnerJoin();
	//1.2 Outer Join
		//1.2.1 Right Join
	public List<Factura> seleccionarFacturasRightJoin();
		//1.2.2 Left Join
	public List<Factura> seleccionarFacturasLeftJoin();
		//1.2.3 Full Join
	public List<Factura> seleccionarFacturasFulltJoin();
	//1.3 where Join
	public List<Factura> seleccionarFacturasWheretJoin();
	//1.3 Fetch Join
	public List<Factura> seleccionarFacturasFetchJoin();
	//
	public List<FacturaDTO> seleccionarFactutrasDTO();

	
	public List<Factura> seleccionarTodos();
	
}
