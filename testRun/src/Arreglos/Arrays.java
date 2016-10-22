package Arreglos;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[12];
		
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		
		for (int i = 4; i < numeros.length; i++){
			numeros[i] = i + 1;
		}
		
		for (int i = 0; i < numeros.length; i++){
			numeros[i] = i + 1;
			System.out.println("Numeros[" + i + "] = " + numeros[i]);
		}
		
		
		String[] nombres = {"Roy", "Robert", "Xinia"};
		
		String nombre = "Mario J Hernandez Vargas";
		
		for ( int i = 0; i < nombre.length(); i ++){
			char letra = nombre.charAt(i);
			System.out.println("Letra en posicion (" + i + ") = " + letra );
			
					
		}
		int contador = 0;
		for (String nombre1 : nombres ){
			
			System.out.println(" nombres(" + contador + ") = " + nombre1 );
			contador ++;
			
		}
		
	}

}
