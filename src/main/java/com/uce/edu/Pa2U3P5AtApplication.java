package com.uce.edu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.ventas.repository.modelo.Artista;
import com.uce.edu.demo.ventas.repository.modelo.Cancion;
import com.uce.edu.demo.ventas.service.IArtistaService;

@SpringBootApplication
public class Pa2U3P5AtApplication  implements CommandLineRunner{

	@Autowired
	private  IArtistaService artistaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5AtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	/*	Artista a1= new Artista ();
		a1.setNombre("Sofia Gabanna");
		a1.setEdad("23");
		a1.setNacionalidad("Argentina");
		a1.setSelloDiscografico("BUENOS HERMANOS");
		
		Artista a2= new Artista ();
		a2.setNombre("Duki");
		a2.setEdad("27");
		a2.setNacionalidad("Argentina");
		a2.setSelloDiscografico("Mueva Records");
		
		Artista a3= new Artista ();
		a3.setNombre("Big Stan");
		a3.setNacionalidad("Colombiano");
		a3.setSelloDiscografico("S/N");
		
		////////////////////////
		
		Cancion c1=new Cancion ();
		c1.setNombre("Calma fugaz");
		c1.setGenero("Hip hop");
		c1.setFechaLanzamiento(LocalDate.of(2019, 2, 8));
		c1.setArtista(a1);
		
		Cancion c2=new Cancion ();
		c2.setNombre("Fui tu silencio");
		c1.setGenero("Hip hop");
		c2.setArtista(a1);
		
		Cancion c3=new Cancion ();
		c3.setNombre("Movimiento");
		c3.setGenero("Regeton");
		c3.setFechaLanzamiento(LocalDate.of(2021, 2, 05));
		c3.setArtista(a2);
		
		Cancion c4=new Cancion ();
		c4.setNombre("She don't give a fo");
		c4.setGenero("Trap");
		c4.setFechaLanzamiento(LocalDate.of(2018, 8, 01));
		c4.setArtista(a2);
		
		Cancion c5=new Cancion ();
		c5.setNombre("Givenchy");
		c5.setGenero("Trap");
		c5.setFechaLanzamiento(LocalDate.of(2022, 7, 01));
		c5.setArtista(a2);

		Cancion c6=new Cancion ();
		c6.setNombre("Un tequila");
		c6.setGenero("Rap");
		c6.setFechaLanzamiento(LocalDate.of(2019, 11, 01));
		c6.setArtista(a3);
		
		List<Cancion> cancionesB=new ArrayList<>();
		cancionesB.add(c6);
		a3.setCanciones(cancionesB);
		
		
		List<Cancion> cancionesS=new ArrayList<>();
		cancionesS.add(c1);
		cancionesS.add(c2);
		a1.setCanciones(cancionesS);
		
		
		List<Cancion> cancionesD=new ArrayList<>();
		cancionesD.add(c3);
		cancionesD.add(c4);
		cancionesD.add(c5);
		a2.setCanciones(cancionesD);
		
		this.artistaService.guardar(a1);
		this.artistaService.guardar(a2);
		this.artistaService.guardar(a3);*/
		System.out.println("INNER JOIN");
		this.artistaService.buscarArtistasInnerJoin().stream().forEach(System.out::println);
		this.artistaService.buscarCancionesInnerJoin().stream().forEach(System.out::println);
		
		System.out.println("RIGHT JOIN ");
		this.artistaService.buscarArtistasOuterRigthJoin().stream().forEach(System.out::println);
		this.artistaService.buscarCancionesOuterRigthJoin().stream().forEach(System.out::println);
		
		System.out.println("LEFT JOIN");
		this.artistaService.buscarArtistasOuterLeftJoin().stream().forEach(System.out::println);
		this.artistaService.buscarCancionesOuterLeftJoin().stream().forEach(System.out::println);
		
		System.out.println("FULL JOIN");
		this.artistaService.buscarArtistasOuterFulltJoin().stream().forEach(System.out::println);
		this.artistaService.buscarCancionesOuterFulltJoin().stream().forEach(System.out::println);
		
		System.out.println("WHERE JOIN");
		this.artistaService.buscarArtistasWhereJoin().stream().forEach(System.out::println);
		this.artistaService.buscarCancionesOuterRigthJoin().stream().forEach(System.out::println);
		
		System.out.println("FETCH JOIN");
		this.artistaService.buscarArtistaFetchJoin().stream().forEach(System.out::println);
		this.artistaService.buscarCancionFetchJoin().stream().forEach(System.out::println);
		
		
		
	}

}
