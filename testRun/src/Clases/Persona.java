package Clases;

public class Persona {
	public int Edad;
	public String Nombre = "";
	
	public Persona(int _Edad, String _Nombre){
		this.Edad = _Edad;
		this.Nombre = _Nombre;
	}
	public Persona(int _Edad){
		this.Edad = _Edad;
		this.Nombre = "Sin Registrar";
	}
	public Persona(){
		this.Edad = 0;
		this.Nombre = "Sin Registrar";
	}
	public void Print(){
		System.out.println("");
		System.out.print("Clase Persona Nombre: {" + this.Nombre + "}, Edad: {" + this.Edad +"}");
	}
}
