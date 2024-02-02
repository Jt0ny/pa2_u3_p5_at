package com.uce.edu.demo.ventas.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="artista")
public class Artista {
	
	@GeneratedValue(generator ="seq_artista",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_artista",sequenceName = "seq_artista",allocationSize = 1)
	@Id
	@Column(name = "arti_id")
	private Integer id;

	@Column(name = "arti_nombre")
	private String nombre;
	
	@Column(name = "arti_edad")
	private String edad;
	
	@Column(name = "arti_nacionalidad")
	private String nacionalidad;
	
	@Column(name = "arti_sello_discografico")
	private String selloDiscografico;

	@OneToMany(mappedBy = "artista",cascade = CascadeType.ALL)
	private List<Cancion> canciones;
	
	
	
	
	@Override
	public String toString() {
		return "Artista [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad
				+ ", selloDiscografico=" + selloDiscografico + "]";
	}

	//set y get 
	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getSelloDiscografico() {
		return selloDiscografico;
	}

	public void setSelloDiscografico(String selloDiscografico) {
		this.selloDiscografico = selloDiscografico;
	}
	

	
	
}
