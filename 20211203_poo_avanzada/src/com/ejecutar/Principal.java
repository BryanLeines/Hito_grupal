package com.ejecutar;

//necesario si la clase NO está en el mismo paquete
import com.base.Animal;
import com.base.Ballena;
import com.base.Gato;
import com.base.Perro;

//encapsulamiento : atributos private que son accesibles con getter/setter
//modificadores de acceso:public / private / protected / default*
//sobrecarga : dos métodos con diferente número o tipo de atributos
//sobreescritura:clase hija con el mismo método que la padre
//herencia : extends - java herencia simple
//interface : implements : java implementación múyltiple
//clases abstractas : NO pueden instanciarse
//polimorfismo

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciar la clase Animal
		//en java siempre existe el constructor por defecto
		//Animal No puedo instanciar porque es abstracta
		/*Animal animal=new Animal();
		String mensaje=animal.saltar();
		System.out.println(mensaje);*/
		
		Perro perro = new Perro();
		perro.correr();
		float solucion=perro.calcular(1000);//llamo a un método con un parámetro
		System.out.println(solucion);
		float dato =perro.calcular(10, 5);//uso de sobrecargar
		System.out.println(dato);
		
		Gato gato=new Gato();
		gato.correr();
		gato.correr(15800);
		
		//polimorfismo
		Perro perro1=new Perro();
		Gato gato1 = new Gato();
		Ballena ballena1 = new Ballena();
		
		Animal[] zoo={gato1,perro1,ballena1};
		zoo[1].correr();//polimorfismo basado en herencia (*otro polimorfismo basado en interfaces)
		
		
	}

}
