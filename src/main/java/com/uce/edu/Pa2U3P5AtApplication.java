package com.uce.edu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.ventas.repository.modelo.DetalleFactura;
import com.uce.edu.demo.ventas.repository.modelo.Factura;
import com.uce.edu.demo.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5AtApplication  implements CommandLineRunner{

	@Autowired
	private IFacturaService facturaService;
	
	//Join Types en Jakarta Persistence
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5AtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		System.out.println("Inner Join");

		List<Factura>lista=this.facturaService.buscarFacturasInnerJoin();

		for(Factura f:lista) {
			System.out.println(f.getNumero());
//			for(DetalleFactura d :f.getDetalleFacturas()) {
//				System.out.println(d.getNombreProducto());
//			}
			
		}
		//
		System.out.println("Where Join");
		List<Factura>lista1=this.facturaService.buscarFacturasWheretJoin();
		for(Factura f:lista1) {
			System.out.println(f.getNumero());
			for(DetalleFactura d :f.getDetalleFacturas()) {
				System.out.println(d.getNombreProducto());
			}
		}
		//
		System.out.println(" Fetch Join");
		List<Factura>lista2=this.facturaService.buscarFacturasFetchJoin();
		for(Factura f:lista2) {
			System.out.println(f.getNumero());
			for(DetalleFactura d :f.getDetalleFacturas()) {
				System.out.println(d.getNombreProducto());
			}
		}
	}

}
