
public class MultiHilo implements Runnable{


	private Thread hilo;
	private String nombreHilo;
	private String Palabra ="A";
	private boolean Letra = false;
	private int Cantidad = 1000;
	
	  MultiHilo(String nombre){
	    nombreHilo = nombre;
	    
	  }

	  public void run() {
	    
	    try {
	      for(int i = 1; i < Cantidad; i++) {
	    	  if (Letra) {
	    		  System.out.println(Palabra);
	    	  } else {
	    		  System.out.println(i);
	    	  }	        
	        Thread.sleep(10);
	      }
	    } catch (InterruptedException e) {
	      System.out.println("Hilo " + nombreHilo + " interrumpido.");
	    }

	    System.out.println("Hilo " + nombreHilo + " termino.");
	  }

	  public void start () {
	   
	    if (hilo == null) {
	      hilo = new Thread (this, nombreHilo);
	      hilo.start ();
	    }
	  }

	public String getPalabra() {
		return Palabra;
	}

	public void setPalabra(String palabra) {
		Palabra = palabra;
	}

	public boolean isLetra() {
		return Letra;
	}

	public void setLetra(boolean letra) {
		Letra = letra;
	}
	public void SetCantidad (int value){
		Cantidad = value;
	}
	public String GetNombre(){
		return nombreHilo;
	}

}

