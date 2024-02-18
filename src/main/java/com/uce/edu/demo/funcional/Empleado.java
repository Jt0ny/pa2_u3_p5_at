package com.uce.edu.demo.funcional;


public class Empleado {

	private String nombreCompleto;
	private String pais;
	
	
	
	@Override
	public String toString() {
		return "Empleado [nombreCompleto=" + nombreCompleto + ", pais=" + pais + "]";
	}
	//get y set
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
