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
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5AtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		/*Factura fac= new Factura();
		fac.setCedula("123");
		fac.setFecha(LocalDate.now());
		fac.setNumero("001-231");
		
		DetalleFactura deta= new DetalleFactura();
		deta.setCantidad(4);
		deta.setCodigoBarras("789456");
		deta.setFactura(fac);
		deta.setNombreProducto("Coca cola");
		
		DetalleFactura deta1= new DetalleFactura();
		deta1.setCantidad(4);
		deta1.setCodigoBarras("789");
		deta1.setFactura(fac);
		deta1.setNombreProducto("Leche");
		
		List<DetalleFactura>detalleFacturas=new ArrayList<>();
		detalleFacturas.add(deta1);
		detalleFacturas.add(deta);
		
		fac.setDetalleFacturas(detalleFacturas);
		
		this.facturaService.guardar(fac);*/
		
		Factura factura = this.facturaService.buscarPorNumero("001-231");
		for (DetalleFactura det:factura.getDetalleFacturas()) {
			System.out.println(det.getCodigoBarras());
		}
		System.out.println(factura);
		
	}

}
