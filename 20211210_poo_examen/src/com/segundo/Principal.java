package com.segundo;

import com.base.Hija;
import com.base.Padre;
import com.primero.Alumno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno alumno1 = new Alumno(1,"juan l�pez", 4.85f);//instaciar clase
		Alumno alumno2 = new Alumno(2,"mar�a p�rez", 7.85f);
		Alumno alumno3 = new Alumno(3, "luis s�nchez",5.85f);
		//insert : No es presistencia de datos : No se almacenan en una tabla 
		
		//cosultar la calificaci�n del alumno2
		float notaAlumno2 = alumno2.getCalificacion();
		//mostar la notal del alumno2
		//consola sysout
		//Aplicacion de escritorio : swing
		//aplicacion web : p�ginas web dinamicas : jsp
		
		System.out.println("La nota del alumno dos es " +notaAlumno2);
		
		//Padre padre = new Padre();
		
		Hija hija = new Hija();
		hija.saludar("Mar�a", "Madrid");
	}

}
