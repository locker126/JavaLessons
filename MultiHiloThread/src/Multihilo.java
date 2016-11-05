
class Multihilo extends Thread {
  private Thread hilo;
  private String nombreHilo;

  Multihilo(String nombre){
    nombreHilo = nombre;
    System.out.println("Creando " + nombreHilo);
  }

  public void run() {
    System.out.println("Ejecutando " + nombreHilo );
    try {
      for(int i = 4; i > 0; i--) {
        System.out.println("Hilo: " + nombreHilo + ", " + i);
        // vamos a dormir el hilo unos 50s
        Thread.sleep(50);
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
