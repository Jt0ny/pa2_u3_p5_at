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
import com.uce.edu.demo.ventas.repository.modelo.dto.FacturaDTO;
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
	
		
		System.out.println("Update");
		int cantidad=this.facturaService.actualizarFechas(LocalDate.of(2020, 1, 15),LocalDate.of(2024, 1, 10));
		System.out.println("Cantidad de registros /filas actualizadas");
		System.out.println(cantidad);
		
		System.out.println("Delete");
		//int cantidad1=this.facturaService.borarPorNumero("001-231");
		System.out.println("Cantidad de registros /filas eliminadas");
		//System.out.println(cantidad1);
		
		//this.facturaService.borrar(1);
		
		//DTO: Data Transfer Object - Patron de diseño
		
		System.out.println("DTO");
		List<FacturaDTO>listaDTO=this.facturaService.buscarFactutrasDTO();
		for(FacturaDTO fDTO:listaDTO) {
			System.out.println(fDTO);
		}
		
		
	}

}
