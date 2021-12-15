package com.base;

//herencia simple
//hija es subclase en herencia
//padre es superclase en herencia 

public class Hija extends Padre {

	//Sobreescritura de metodos basado en herencia
	public void saludar(String nombre, String ciudad) {
		System.out.println("hola desde hija "+nombre+" en " +ciudad);
	}
	
}
