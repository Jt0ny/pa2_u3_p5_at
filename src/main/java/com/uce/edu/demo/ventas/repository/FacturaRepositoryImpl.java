package com.uce.edu.demo.ventas.repository;

import java.util.List;

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

	//
	@Override
	public List<Factura> seleccionarFacturasInnerJoin() {
		//SQL: select * from factura f inner  join detalle_factura d on f.fact_id=d.defa_id_factura
		//JPQL: select f from Factura f inner join f.detalleFactura d 
		
		
		TypedQuery< Factura>query=this.entityManager.createQuery("select f from Factura f  join f.detalleFacturas d ",Factura.class);
		List<Factura> lista =query.getResultList();
//		
//		for(Factura f :lista) {
//			f.getDetalleFacturas().size();
//		}
		return lista;
	}

	@Override
	public List<Factura> seleccionarFacturasRightJoin() {
	
		TypedQuery< Factura>query=this.entityManager.createQuery("select f from Factura f right join f.detalleFacturas d ",Factura.class);
		List<Factura> lista =query.getResultList();
		
		for(Factura f :lista) {
			f.getDetalleFacturas().size();
		}
		return lista;
	
	}

	@Override
	public List<Factura> seleccionarFacturasLeftJoin() {

		TypedQuery< Factura>query=this.entityManager.createQuery("select f from Factura f Left join f.detalleFacturas d ",Factura.class);
		List<Factura> lista =query.getResultList();
		
		for(Factura f :lista) {
			f.getDetalleFacturas().size();
		}
		return lista;
	}

	@Override
	public List<Factura> seleccionarFacturasFulltJoin() {
		TypedQuery< Factura>query=this.entityManager.createQuery("select f from Factura f full join f.detalleFacturas d ",Factura.class);
		List<Factura> lista =query.getResultList();
		
		for(Factura f :lista) {
			f.getDetalleFacturas().size();
		}
		return lista;
	}

	@Override
	public List<Factura> seleccionarFacturasWheretJoin() {
		// SQL: select f.* from factura f,detalle_factura d where f.fact_id= d.defa_id_factura
		//Usando JPQL
		//JPQL:  select f from Factura f , DetalleFactura d 
		//where f.id =d.factura.id
		//where f = d.factura --
		TypedQuery<Factura>query=this.entityManager.createQuery("select f from Factura f , DetalleFactura d where f = d.factura",Factura.class);
		
		List<Factura> lista =query.getResultList();
		for(Factura f :lista) {
			f.getDetalleFacturas().size();
		}
		return lista;
	}

	@Override
	public List<Factura> seleccionarFacturasFetchJoin() {
		//JPQL: select f from Factura f JOIN FETCH f.detalleFacturas d
		TypedQuery<Factura> query=this.entityManager.createQuery("select f from Factura f JOIN FETCH f.detalleFacturas d",Factura.class);
		
		return query.getResultList();
	}
}
