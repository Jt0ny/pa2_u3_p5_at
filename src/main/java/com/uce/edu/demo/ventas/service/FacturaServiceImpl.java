package com.uce.edu.demo.ventas.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.uce.edu.demo.ventas.repository.IClienteRepository;
import com.uce.edu.demo.ventas.repository.IFacturaRepository;
import com.uce.edu.demo.ventas.repository.modelo.Cliente;
import com.uce.edu.demo.ventas.repository.modelo.Factura;
import com.uce.edu.demo.ventas.repository.modelo.dto.FacturaDTO;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepository facturaRepository;
	@Autowired
	private IClienteService clienteService;
	
	@Override
	public Factura buscarPorNumero(String numero) {
		
		return this.facturaRepository.seleccionarPorNumero(numero);
	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void guardar(Factura factura,Cliente cliente) {
		System.out.println(
		TransactionSynchronizationManager.isActualTransactionActive());
		this.facturaRepository.insertar(factura);
		System.out.println("Paso el insert de factura");
		this.clienteService.guardar(cliente);
		System.out.println("Paso el insert de Cliente");
		
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

	@Override
	public List<Factura> buscarFacturasWheretJoin() {
		
		return this.facturaRepository.seleccionarFacturasWheretJoin();
	}

	@Override
	public List<Factura> buscarFacturasFetchJoin() {
		
		return this.facturaRepository.seleccionarFacturasFetchJoin();
	}

	@Override
	public int actualizarFechas(LocalDate fechaNueva, LocalDate fechaActual) {
		// TODO Auto-generated method stub
		return this.facturaRepository.actualizarFechas(fechaNueva, fechaActual);
	}

	@Override
	public int borarPorNumero(String numero) {
		
		return this.facturaRepository.eliminarPorNumero(numero);
	}

	@Override
	public void borrar(Integer id) {
		this.facturaRepository.eliminar(id);
	}

	@Override
	public List<FacturaDTO> buscarFactutrasDTO() {
		
		return this.facturaRepository.seleccionarFactutrasDTO();
	}

	@Override
	@Transactional(value = TxType.MANDATORY)//obliga a de donde se lo llame tenga una transaccion
	public void prueba() {
		System.out.println("Este metodo es de prueba");
		System.out.println(
				"Prueba: "+TransactionSynchronizationManager.isActualTransactionActive());
				
	}

}
