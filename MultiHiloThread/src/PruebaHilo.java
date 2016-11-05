
public class PruebaHilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multihilo hilo1 = new Multihilo( "Hilo-1");
	    hilo1.start();
	    Multihilo hilo2 = new Multihilo( "Hilo-2");
	    hilo2.start();
	}

}
