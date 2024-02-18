package com.uce.edu.demo.funcional;

public class Main {

	public static void main(String[] args) {
		
	//1.1 Supplier
		System.out.println("**********************************Supplier");
		//clases
		System.out.println("Clases");
		IPersonaSupplier<String>supplierClase=new PersonaSupplierImpl();
		System.out.println(supplierClase.getId()); 
		
		// lambdas
		System.out.println("Lambdas");
		IPersonaSupplier<String>supplierLambda =()->{String cedula="123";
		cedula=cedula+" Canton";
		return cedula;};
		System.out.println(supplierLambda.getId());
		
		IPersonaSupplier<String>supplierLambda2 =()-> "123"+" Pais";
		System.out.println(supplierLambda2.getId());
		
		IPersonaSupplier<Integer>supplierLambda3=()->{
			Integer valor1=Integer.valueOf(100);
			valor1= valor1* Integer.valueOf(50)/Integer.valueOf(5);
			return valor1;};
			System.out.println(supplierLambda3.getId());
			
		//Metodos Referenciados
			System.out.println("Metodos Referenciados");
			MetodosReferenciados met= new MetodosReferenciados();
			IPersonaSupplier<String>supplierLambda4=met::obtenerId;
			System.out.println(supplierLambda4.getId());
			
			
			//2. Consumer
			System.out.println("**********************************Consumer");
				//clases
			System.out.println("Clases");
			IPersonaConsumer<String> consumerClase= new PersonaConsumerImpl();
			consumerClase.accept("Profesor");
			// lambdas
			System.out.println("Lambdas");
			IPersonaConsumer<String>consumerlambda=(cadena)->{
				System.out.println("Se inserta");
				System.out.println(cadena);
			};
			consumerlambda.accept("Profesor");
			
			//Metodos Referenciados
			System.out.println("Metodos Referenciados");
			IPersonaConsumer<String>consumer2=met::procesar;
			consumer2.accept("Anthony Referenciado");
			
			
			//3.Predicate
			System.out.println("**********************************Predicate");
			//lambdas
			System.out.println("Lambdas");
			IPersonaPredicate<Integer>predicateLambda= numero->numero.compareTo(7)==0;
			System.out.println(predicateLambda.evaluar(Integer.valueOf(7)));
			
			
			IPersonaPredicate<String>predicateLambda2= letra->"Anthony".contains(letra);
			System.out.println(predicateLambda2.evaluar("n"));	
			//Metodos Referenciados
			System.out.println("Metodos Referenciados");
			IPersonaPredicate<String>predicate1=met::evaluar;
			System.out.println(predicate1.evaluar("n"));
			
			IPersonaPredicate<Integer>predicate2=met::evaluar;
			System.out.println(predicate2.evaluar(8));
			
			//4.Function
			System.out.println("**********************************Function");
			//lambdas
			System.out.println("Lambdas");
			IPersonaFunction<String, Integer>functionLambda=numero->{
			numero=numero+Integer.valueOf(10);
			String numeroString= numero.toString().concat("-Valor");
			return numeroString;
			};
			System.out.println(functionLambda.aplicar(7));
			
			
			IPersonaFunction<Empleado, Ciudadano>functionLambda1=ciudadano->{
				Empleado empl= new Empleado();
				empl.setNombreCompleto(ciudadano.getNombre()+""+ciudadano.getApellido());
				if(ciudadano.getProvincia().compareTo("Pichincha")==0) {
					empl.setPais("Ecuador");
				}
				return empl;
			};
			Ciudadano ciud=new Ciudadano();
			ciud.setApellido("Anthony");
			ciud.setNombre("Anthony");
			ciud.setProvincia("Pichincha");
			Empleado empl =functionLambda1.aplicar(ciud);
			System.out.println(empl);
			
			//Metodos Referenciados
			System.out.println("Metodos Referenciados");
			Empleado empl2=new Empleado();
			empl2.setNombreCompleto("Anthony Tipan");
			empl2.setPais("Ecuador");
			
			IPersonaFunction<Ciudadano, Empleado>function=met::cambiar;
			Ciudadano ciud2=function.aplicar(empl2);
			System.out.println(ciud2);
			
			
			//4.UnaryOperator
			System.out.println("**********************************Unary Operator");
			//lambdas
			System.out.println("Lambdas");
			IPersonaUnaryOperator<Integer>unaryOperatorLambda=numero->
				numero+(numero*2);
			;
			System.out.println(unaryOperatorLambda.aplicar(14)); 
			
		
			IPersonaUnaryOperatorFunction<Integer>unaryOperatorLambda2=numero->numero+(numero*2);
			System.out.println(unaryOperatorLambda2.aplicar(14)); 
			
			//Metodos Referenciados
			System.out.println("Metodos Referenciados");
			IPersonaUnaryOperator<Empleado>unaryOperator1=met::procesar;
			Empleado empl3=unaryOperator1.aplicar(empl2);
			System.out.println(empl3);
	}

}
