package com.base;

//herencia simple en Java. Java únicamente soporta la herencia simple
public class Perro extends Animal {
	
	public void correr() {
		System.out.println("perro corriendo");
	}
	
	public float calcular(int unidades) {
		return unidades*1.5f;//f indica que es un float
	}
	//sobrecarga de métodos :diferentes número argumentos
	public float calcular(int unidades,float valor) {
		return unidades*valor;//f indica que es un float
	}
	//sobrecarga con mismos argumentos y diferentes tipos de dato en argumento
	public float calcular(int unidades,int valor) {
		return unidades*valor;//f indica que es un float
	}
	//en java NO soporta sobrecarga por diferente tipo de retorno
	public double calcular2(int unidades,int valor) {
		return unidades*valor*0.25;//f indica que es un float
	}

}//cierra clase
