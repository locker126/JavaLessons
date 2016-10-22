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
		
	}

}
