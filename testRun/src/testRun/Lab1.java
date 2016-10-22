package testRun;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner numero = new Scanner(System.in);
        System.out.print("Introduce el número inicial: ");
        int num = numero.nextInt();
        System.out.print("Introduce el número final: ");
        int num2 = numero.nextInt();
		Lab1For(num,num2);
		Lab1While(num, num2);
		Lab1DoWhile(num, num2);
		
		numero.close();
		
	}
	
	private static void Lab1For(int Inicio, int Fin ){
		int y = Fin;
		System.out.println(" ");
		System.out.print ("Numero divisible usando For       ");
		
		for (int contador = Inicio; contador < y; contador++)
		{
		
			if ((contador % 7 == 0) && (contador % 11 == 0)) {
				
				System.out.print ( contador  + ";");
								
			}			
			
		}	
	
	}
	
	private static void Lab1While(int Inicio, int Fin){
		int y = Fin;
		
		int contador = Inicio;
		System.out.println(" ");
		System.out.print ("Numero divisible usando while:    ");
		while (contador < y) {
			contador ++;
			if ((contador % 7 == 0) && (contador % 11 == 0)) {
				System.out.print (contador + ";");				
			}			
			
		}
		
	}
	private static void Lab1DoWhile(int Inicio, int Fin){
		int y = Fin;
		System.out.println(" ");
		System.out.print ("Numero divisible usando do while: ");
		int contador = Inicio;
		
		do  {
			
			if ((contador % 7 == 0) && (contador % 11 == 0)) {
				System.out.print (contador + ";");				
			}			
			contador ++;
		}while (contador < y);
		
	}

}
