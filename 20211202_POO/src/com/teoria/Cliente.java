package com.teoria;

public class Cliente {
	
	//Atributos de clase:
	
	//Ejemplo de encapsulamiento : modificadores de acceso (getter y setter);
	private String nombre;
	private float presupuesto; //private: solo accesible en su clase
	private boolean activo;
	
	
	//Constructor (necesitamos const. porque nuestra clase no es static):
	public Cliente(String nombre, float presupuesto, boolean activo) {
		super();
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.activo = activo;
	}


	//Getters y setters (Gestionar atributos CRUD):
	public String getNombre() { //protected: solo accesibles en su paquete
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPresupuesto() {
		return presupuesto;
	}


	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	
	//Métodos genéricos (sobrecarga y sobreescritura / overload vs override):
	
	@Override //decorador
	public String toString() {
		return "Cliente [nombre=" + nombre + ", presupuesto=" + presupuesto + ", activo=" + activo + "]";
	}
	
	public float calcularDescuento(float importe){
		float descuento;
		if (importe>10000)
		
			descuento=50.95f;
		
		else 
			descuento=0.0f;
		
		return descuento;
	}
	
}// cierra clase
