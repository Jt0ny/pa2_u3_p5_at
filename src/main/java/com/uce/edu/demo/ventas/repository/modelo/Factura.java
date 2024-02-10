package com.uce.edu.demo.ventas.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="seq_factura" )
	@SequenceGenerator(name = "seq_factura",sequenceName = "seq_factura",allocationSize = 1)
	@Column(name="fact_id")
	private Integer id;
	
	@Column(name="fact_numero")
	private String numero;
	
	@Column(name="fact_fecha")
	private LocalDate fecha;
	
	@Column(name="fact_cedula")
	private String cedula;
	
	
	@Transient//Para cuando no quiero que se mapee un atributo
	private BigDecimal valorIVA;

	@OneToMany(mappedBy = "factura",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<DetalleFactura> detalleFacturas;
	
	
	
//	@Override
//	public String toString() {
//		return "Factura [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedula=" + cedula + "]";
//	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedula=" + cedula
				+ ", detalleFacturas=" + detalleFacturas + "]";
	}

	//set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<DetalleFactura> getDetalleFacturas() {
		return detalleFacturas;
	}

	public void setDetalleFacturas(List<DetalleFactura> detalleFacturas) {
		this.detalleFacturas = detalleFacturas;
	}

	public BigDecimal getValorIVA() {
		return valorIVA;
	}

	public void setValorIVA(BigDecimal valorIVA) {
		this.valorIVA = valorIVA;
	}

	
	
}
