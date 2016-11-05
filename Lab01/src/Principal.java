import java.util.Observable;
import java.util.Observer;

public class Principal {

	public static void main(String[] args) {
		FuenteEvento EventSource = new FuenteEvento();
		EventSource.addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				MultiHilo Hilo = (MultiHilo) arg;
				
				if (Hilo.GetNombre().equals("Hilo1")) {
					Hilo.setPalabra("A");
					Hilo.setLetra(true);
					Hilo.SetCantidad(100);
					Hilo.start();	
				} else {
					Hilo.setPalabra("A");
					Hilo.setLetra(false);
					Hilo.SetCantidad(100);
					Hilo.start();
					
				}
				
				
				
				//System.out.println("\nRespuesta recibida: " + arg);
				if (Hilo.GetNombre().equals("X")) { System.out.println("Finalizado!"); }
				
			}
		});
		new Thread(EventSource).start();	    
			
	}
	
	
	private void Eje(){
		// TODO Auto-generated method stub
					MultiHilo hilo1 = new MultiHilo( "Hilo-1");
					MultiHilo hilo2 = new MultiHilo( "Hilo-2");
					
					hilo1.setPalabra("A");
					hilo1.setLetra(true);
					hilo1.SetCantidad(10);
					    hilo1.start();
					    
					    
					    hilo2.setLetra(false);
					    hilo2.SetCantidad(10);    
					    hilo2.start();	
	}

}
