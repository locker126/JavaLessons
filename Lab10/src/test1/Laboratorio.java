/**
 * 
 */
package test1;

/**
 * @author JAVA
 *
 */
public class Laboratorio {

	/**
	 * 
	 */
	public Laboratorio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 50000;
		String concatenator = "Cadena a encadenar";
		@SuppressWarnings("unused")
		String str = concatenator;
		
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < number; i++){
			
			str += concatenator;
		}
		
		
		long end2 = System.currentTimeMillis();
		long result2 = end2 - start2;
		
		System.out.println("Tiempo : " + result2);
		
		StringBuilder sb = new StringBuilder();
		long start = System.currentTimeMillis();
		for(int i = 0; i < number; i++){
			
			sb.append( concatenator);
		}
		
		
		long end = System.currentTimeMillis();
		long result = end - start;
		
		System.out.println("Tiempo : " + result);
		
		
	}

}
