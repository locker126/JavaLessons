
public class multiHilo implements Runnable{



	private Thread hilo;
	  private String nombreHilo;

	  multiHilo(String nombre){
	    nombreHilo = nombre;
	    System.out.println("Creando " + nombreHilo);
	  }

	  public void run() {
	    
	    try {
	      for(int i = 1; i >= 10000; i++) {
	        System.out.print(i);
	        // vamos a dormir el hilo unos 50s
	        Thread.sleep(10);
	      }
	    } catch (InterruptedException e) {
	      System.out.println("Hilo " + nombreHilo + " interrumpido.");
	    }

	    System.out.println("Hilo " + nombreHilo + " termino.");
	  }

	  public void start () {
	    System.out.println("Iniciando " + nombreHilo );
	    if (hilo == null) {
	      hilo = new Thread (this, nombreHilo);
	      hilo.start ();
	    }
	  }

}
