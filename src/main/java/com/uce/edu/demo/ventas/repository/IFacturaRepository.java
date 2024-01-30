package com.uce.edu.demo.ventas.repository;

import java.util.List;

import com.uce.edu.demo.ventas.repository.modelo.Factura;

public interface IFacturaRepository {
	
	public Factura seleccionarPorNumero(String numero);
	public void insertar(Factura factura);
	
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
	

}
