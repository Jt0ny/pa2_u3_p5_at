package com.uce.edu.demo.ventas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.ventas.repository.IArtistaRepository;
import com.uce.edu.demo.ventas.repository.modelo.Artista;
import com.uce.edu.demo.ventas.repository.modelo.Cancion;



@Service
public class ArtistaServiceImpl implements IArtistaService{

	@Autowired
	private IArtistaRepository artistaRepository;
	
	@Override
	public void guardar(Artista artista) {
		this.artistaRepository.insertar(artista);
		
	}

	@Override
	public List<Artista> buscarArtistasInnerJoin() {
		return this.artistaRepository.seleccionarArtistasInnerJoin();
	}

	@Override
	public List<Cancion> buscarCancionesInnerJoin() {
		
		return this.artistaRepository.seleccionarCancionesInnerJoin();
	}

	@Override
	public List<Artista> buscarArtistasOuterRigthJoin() {
		
		return this.artistaRepository.seleccionarArtistasOuterRigthJoin();
		}

	@Override
	public List<Cancion> buscarCancionesOuterRigthJoin() {
		
		return this.artistaRepository.seleccionarCancionesOuterRigthJoin();
	}

	@Override
	public List<Artista> buscarArtistasOuterLeftJoin() {
		
		return this.artistaRepository.seleccionarArtistasOuterLeftJoin();
	}

	@Override
	public List<Cancion> buscarCancionesOuterLeftJoin() {
		
		return this.artistaRepository.seleccionarCancionesOuterLeftJoin();
	}

	@Override
	public List<Artista> buscarArtistasOuterFulltJoin() {
		
		return this.artistaRepository.seleccionarArtistasOuterFulltJoin();
	}

	@Override
	public List<Cancion> buscarCancionesOuterFulltJoin() {
		
		return this.artistaRepository.seleccionarCancionesOuterFulltJoin();
	}

	@Override
	public List<Artista> buscarArtistasWhereJoin() {
		
		return this.artistaRepository.seleccionarArtistasWhereJoin();
	}

	@Override
	public List<Cancion> buscarCancionesWhereJoin() {
		
		return this.artistaRepository.seleccionarCancionesWhereJoin();
	}

	@Override
	public List<Artista> buscarArtistaFetchJoin() {
		
		return this.artistaRepository.seleccionarArtistaFetchJoin();
	}

	@Override
	public List<Cancion> buscarCancionFetchJoin() {
		return this.artistaRepository.seleccionarCancionFetchJoin();
	}

}
