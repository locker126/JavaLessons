package Arreglos;

public class Mcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v1 = {1,2,3,4,5};
		
		int[] v2 = new int[v1.length];
		int contador = 0;
		for( int numero : v1){
			v2[contador] = numero;
			contador++;
			
		}
		
		for (int numero : v2){
			System.out.println(numero);
			
		}
		
		
	}

}
