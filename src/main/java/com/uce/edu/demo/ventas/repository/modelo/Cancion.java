package com.uce.edu.demo.ventas.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cancion")
public class Cancion {
	
	@GeneratedValue(generator ="seq_cancion",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_cancion",sequenceName = "seq_cancion",allocationSize = 1)
	@Id
	@Column(name = "canc_id")
	private Integer id;
	
	@Column(name = "canc_nombre")
	private String nombre;
	
	@Column(name = "canc_genero")
	private String genero;
	
	@Column(name = "canc_fecha_lanzamiento")
	private LocalDate fechaLanzamiento;

	@ManyToOne
	@JoinColumn(name="canc_id_artista")
	private Artista artista;
	
	
	
	@Override
	public String toString() {
		return "Cancion [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", fechaLanzamiento="
				+ fechaLanzamiento + ", artista="+artista+ "]";
	}
	
	
	// set y get 
	public Integer getId() {
		return id;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	
	


}
