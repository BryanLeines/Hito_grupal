package com.primero;

public class Alumno {

	//atributos : modificador privado : mínimo nivel de visibilidad
	private int id;
	private String nombre;
	private float calificacion;
	
	//constructor
	public Alumno(int id, String nombre, float calificacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.calificacion = calificacion;
	}

	//getters y setters : encapsulamiento
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	
	
	//genéricos
}//cierra clase
