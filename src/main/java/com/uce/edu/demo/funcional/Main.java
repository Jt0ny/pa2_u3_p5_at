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
			
			
			//3.Predicate
			System.out.println("**********************************Predicate");
			//lambdas
			System.out.println("Lambdas");
			IPersonaPredicate<Integer>predicateLambda= numero->numero.compareTo(7)==0;
			System.out.println(predicateLambda.evaluar(Integer.valueOf(7)));
			
			
			IPersonaPredicate<String>predicateLambda2= letra->"Anthony".contains(letra);
			System.out.println(predicateLambda2.evaluar("n"));			
			
			
			
			
		


	}

}
