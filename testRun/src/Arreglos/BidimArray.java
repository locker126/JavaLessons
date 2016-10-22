package Arreglos;

public class BidimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][] m1 = { {1,2,3},{4,5,6},{7,8,9} };
			int columna = 0;
			int fila = 0;
			for(int[] valor : m1){	
				for (int numero : valor){
					System.out.println("m1 [" + columna + "][" + fila + "] = " + numero);
					fila ++;
				}
				System.out.println("");
				fila = 0;
				columna ++;
			}
	}

}
