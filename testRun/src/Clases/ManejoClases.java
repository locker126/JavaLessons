package Clases;

public class ManejoClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona x = new Persona();
		Persona y = new Persona(16);
		Persona z = new Persona(30, "Mario José Hernández Vargas");
		print(y);
		print (z);
		print(  "Mario José Hernandez Vargas", 35,z);
		print("Maria Fernanda Hernandez Somarriba", 9, x);
	}
	private static void print (Persona p){
		p.Edad ++;
		System.out.println(p.Edad);
		
	}
	private static void print(String Nombre, int Edad, Persona p){
		p.Edad = Edad;
		p.Nombre = Nombre;
		p.Print();
	}
	

}
