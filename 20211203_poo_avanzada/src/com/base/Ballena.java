package com.base;

import com.operaciones.IOperaciones;

//java NO soporta herencia múltiple. Python sí.
//java se puede heredar una superclass e implementar una interface a la vez
//en java existe implementación múltiple
public class Ballena extends Animal implements IOperaciones  {
//todas las clases hijas sobreescriben métodos de la clase Padre
	public void correr() {
		System.out.println("ballena corriendo");
	}
	
	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		System.out.println("la ballena nada boca arriba");
	}

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return "la ballena respira fuera del agua";
	}

	
	
}//cierra Ballena
