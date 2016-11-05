package Main;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleObject M = SingleObject.getInstance();
		
		System.out.println(M.NomInstancia);
		
		SingleObject C = SingleObject.getInstance();
		try {
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		System.out.println(C.NomInstancia);
		
	}

}
