
public class PruebaHilo {
	 public static void main(String args[]) {
		    multiHilo hilo1 = new multiHilo( "Hilo-1");
		    hilo1.start();
		    multiHilo hilo2 = new multiHilo( "Hilo-2");
		    hilo2.start();
		  }
}
