package com.practica;

import com.teoria.Cliente;

public class Ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		
		//instanciar
		Cliente cliente1 =new Cliente("Juan",987.1f,true);
		System.out.println(cliente1.getNombre());
		System.out.println(cliente1.toString());
		cliente1.setPresupuesto(20000);
		System.out.println(cliente1.calcularDescuento(cliente1.getPresupuesto()));
	}

}
