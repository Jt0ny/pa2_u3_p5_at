package com.uce.edu.demo.ventas.repository;

import java.util.List;

import com.uce.edu.demo.ventas.repository.modelo.Artista;
import com.uce.edu.demo.ventas.repository.modelo.Cancion;


public interface IArtistaRepository {
	
	public void insertar (Artista artista);
	
	public List<Artista> seleccionarArtistasInnerJoin();
	public List<Cancion> seleccionarCancionesInnerJoin();
	
	public List<Artista> seleccionarArtistasOuterRigthJoin();
	public List<Cancion> seleccionarCancionesOuterRigthJoin();
	
	public List<Artista> seleccionarArtistasOuterLeftJoin();
	public List<Cancion> seleccionarCancionesOuterLeftJoin();
	
	public List<Artista> seleccionarArtistasOuterFulltJoin();
	public List<Cancion> seleccionarCancionesOuterFulltJoin();
	
	public List<Artista> seleccionarArtistasWhereJoin();
	public List<Cancion> seleccionarCancionesWhereJoin();
	
	public List<Artista> seleccionarArtistaFetchJoin();
	public List<Cancion> seleccionarCancionFetchJoin();
	


}
