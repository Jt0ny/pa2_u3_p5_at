package com.uce.edu.demo.ventas.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.ventas.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepositoryImpl implements IFacturaRepository{

		@PersistenceContext
		private EntityManager entityManager;
	
	@Override
	public Factura seleccionarPorNumero(String numero) {
	
		TypedQuery< Factura>query=this.entityManager.createQuery("select f from Factura f where f.numero=:numero",Factura.class);
		query.setParameter("numero", numero);
		Factura fac=query.getSingleResult();
		fac.getDetalleFacturas().size();//le digo que cargue el detalle bajo demanda, es la señal pa traer la info de detalleFactura (con lazy)
		return fac;
	}

	@Override
	public void insertar(Factura factura) {
		this.entityManager.persist(factura);
		
	}

}
