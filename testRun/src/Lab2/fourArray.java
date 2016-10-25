package Lab2;

public class fourArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escribir un programa que llene una matriz bidimensional de tamaño 4X4 con números aleatorios.
		//Recorrer la matriz y multiplicar todos los números impares por 2, por lo que todos los números se convierten
		//por lo que todos los numeros se convierten en par o 0
		
		int[][] v1 = new int[4][4];
	
		
		for (int i = 0; i < v1.length; i++){
			for (int j = 0; j < v1[i].length; j++){
				int valor = (int) (Math.random()*5+1);
				if (valor < 0 ) valor *= -1;
				
				if (valor%2!=0) valor *= 2; 
				v1[i][j] = valor;
				System.out.println( "v1[" + i + "][" + j + "]" +  v1[i][j]);
			}
			
		}
		System.out.println("Esta es una prueba de GIT desde Visual Studio")
		
		
		
		
		
	}

}
