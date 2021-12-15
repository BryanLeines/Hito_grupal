package com.base;

public abstract class Padre {//clase abstracta NO puede ser instaciada

	//método con retorno
	
	public String saludar(String nombre) {
		return "hola" +nombre;
	}
	//método sin retorno
	public void saludar(String nombre, String ciudad) {
		System.out.println("hola "+nombre+" en " +ciudad);
	}
}
