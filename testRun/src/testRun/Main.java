package testRun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	PrimerDemo();
	//	ExampleScanner();
	//	IfAnidado();
	//	whileLoop();
	//	forLoop();
	//	factorial();
	}
	private static int Suma(int x, int y){
		return x + y;
	}

	@SuppressWarnings("unused")
	private static void PrimerDemo(){
		System.out.println("ok");
		//Modificacion para GIT
		System.out.println("Prueba");
		
		int b =  Suma(2,3);
		
		try
		{
			b += Suma(6,5);
			b /= Suma(2,2);	
		} catch(Exception eb) {
			b = -1;
			
		}
		
		if (b > 0) {
			
			System.out.println(String.valueOf(b));	
		} else 
		{
			System.out.println("Invalido");
		}
		
		System.out.println(String.valueOf(b));
		
		
		int edad = 19;
		double preciobase = 1500;
		int precio = 1600;
		double imp = 1.15;
		double imp1 = 1.30;
		
		Boolean bPrecio = (precio < preciobase);
		
		
		if (edad > 18 && bPrecio) {
			
			precio *= imp;
			
		} else {
			
			precio *= imp1;
		}
		
		
		System.out.println(precio);
	}
	@SuppressWarnings("unused")
	private static void ExampleScanner(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Digite una palabra: ");
		String palabra = input.nextLine();
		System.out.println("La palabra digitada es: " + palabra);
		
	}
	@SuppressWarnings("unused")
	private static void IfAnidado(){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Ingrese un número por favor: ");
		String mensaje = input.nextLine();
		int numero = 0;
		
		try {
			numero = Integer.parseInt(mensaje);
			
		} catch (Exception eb){
			numero = eb.hashCode();
		}
		
		if (numero >0 && numero <= 10) {
			System.out.print("Numero entre 0 y 10");	
		}else if (numero >10 && numero < 50){
			System.out.print("Numero entre 11 y 50");
		} else {
			System.out.print("Numero mayor a 50 ");
		}
		
	}

	@SuppressWarnings("unused")
	private static void whileLoop(){
		int contador = 0;
		while (contador< 10) {
			System.out.println(contador);
			contador ++;
			
			
		}
		
		
		do {
			System.out.println(contador);
			contador --;
			
		} while (contador >= 0);
		
		
	}
	@SuppressWarnings("unused")
	private static void forLoop(){
		
		int contador = 0;
		
		for (int i = 10; i > contador; contador++ )
		//--while (contador< 10) 
		{
			System.out.println(contador);
		
		}
	}
	@SuppressWarnings("unused")
	private static void factorial(){
		//Ej.: El factorial de 5 es: 5*4*3*2*1
        long factorial=1;
        int num;
        @SuppressWarnings("resource")
		Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
				
	}
	
}
