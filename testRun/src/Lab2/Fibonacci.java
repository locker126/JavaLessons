package Lab2;

import java.util.Scanner;

public class Fibonacci {

	public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
        System.out.print("Introduce el Fibonacci que desees: ");
        int n = numero.nextInt();
        
        long [][] fibo = new long [n][2];
        
        for (int i = 0; i < n; i++){ 
        	fibo[i][0] = i;
        	fibo[i][1] = fibonacci(i + 1);
        	System.out.println("");
        	System.out.print("FIBO[" + i +"][0] = " + (i+1));
        	System.out.print(" :: FIBO[" + i +"][1] = " + fibo[i][1]);
    }
        
            
        numero.close();
    }

}
