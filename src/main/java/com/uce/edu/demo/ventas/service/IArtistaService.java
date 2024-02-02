package com.uce.edu.demo.ventas.service;

import java.util.List;

import com.uce.edu.demo.ventas.repository.modelo.Artista;
import com.uce.edu.demo.ventas.repository.modelo.Cancion;

public interface IArtistaService {
	
	public void guardar (Artista artista);

	public List<Artista> buscarArtistasInnerJoin();
	public List<Cancion> buscarCancionesInnerJoin();
	
	public List<Artista> buscarArtistasOuterRigthJoin();
	public List<Cancion> buscarCancionesOuterRigthJoin();
	
	public List<Artista> buscarArtistasOuterLeftJoin();
	public List<Cancion> buscarCancionesOuterLeftJoin();
	
	public List<Artista> buscarArtistasOuterFulltJoin();
	public List<Cancion> buscarCancionesOuterFulltJoin();
	
	public List<Artista> buscarArtistasWhereJoin();
	public List<Cancion> buscarCancionesWhereJoin();
	
	public List<Artista> buscarArtistaFetchJoin();
	public List<Cancion> buscarCancionFetchJoin();

}
