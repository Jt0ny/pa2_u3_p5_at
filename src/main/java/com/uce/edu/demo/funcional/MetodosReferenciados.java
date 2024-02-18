package com.uce.edu.demo.funcional;

public class MetodosReferenciados {

	public String obtenerId() {
		String cedula="123";
		cedula=cedula+" Provincia";
		return cedula;
	}
	
	public void procesar(String cadena) {
		System.out.println(cadena);
		System.out.println("Se proceso la cadena");
	}
	
	public boolean evaluar(String cadena) {
	return "Anthony".contains(cadena);
	}
	

	public boolean evaluar(Integer numero) {
	return 8==numero;
	}
	
	public Ciudadano cambiar(Empleado empl) {
		Ciudadano ciud = new Ciudadano();
		String nombre=empl.getNombreCompleto().split(" ")[0];
		String apellido=empl.getNombreCompleto().split(" ")[1];
		ciud.setApellido(apellido);
		ciud.setNombre(nombre);
		ciud.setProvincia("Pichincha");
		return ciud;
	}
	
	public Empleado procesar (Empleado empl) {
		empl.setNombreCompleto(empl.getNombreCompleto()+" "+empl.getPais());
		empl.setPais(empl.getPais()+"De nacimiento");
		return empl;
	}
	
}
