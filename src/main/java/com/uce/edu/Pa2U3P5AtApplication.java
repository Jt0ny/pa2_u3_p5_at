package com.uce.edu;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.uce.edu.demo.ventas.repository.modelo.Cliente;
import com.uce.edu.demo.ventas.repository.modelo.Factura;
import com.uce.edu.demo.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5AtApplication  implements CommandLineRunner{

	@Autowired
	private  IFacturaService facturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5AtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		//this.facturaService.pruebaSupports();
		
		//this.facturaService.pruebaNever();
	
	
	}

}
