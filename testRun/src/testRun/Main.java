package testRun;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
		
		System.out.print(String.valueOf(b));
	}
	private static int Suma(int x, int y){
		return x + y;
	}

}
