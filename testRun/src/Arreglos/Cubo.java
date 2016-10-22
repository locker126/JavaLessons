package Arreglos;

public class Cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
					int [][][] cubo = new int [3][3][3];
					
					
					int n = 0;
					for (int columna = 0; columna < cubo.length; columna++){
						for (int fila = 0; fila < cubo[columna].length; fila++){
							for (int prof = 0; prof < cubo[columna][fila].length; prof ++){
								
								cubo[columna][fila][prof] = ++n;
								System.out.print("Cubo [" + columna + "][" + fila + "][" + prof + "] = " + n + " ");
							}
							System.out.println("");
							
						}
						
						System.out.println("");
						
						
					}
					
					
	}

}
