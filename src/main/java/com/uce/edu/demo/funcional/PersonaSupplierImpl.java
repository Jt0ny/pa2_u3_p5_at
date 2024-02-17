package com.uce.edu.demo.funcional;

public class PersonaSupplierImpl implements IPersonaSupplier<String>{

	@Override
	public String getId() {
		
		String cedula="123";
		cedula=cedula+" Provincia";
		return cedula;
	}

	

}
