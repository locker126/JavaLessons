import java.util.Observable;
import java.util.Observer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuenteEvento EventSource = new FuenteEvento();
		EventSource.addObserver(new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				
				System.out.println("\nRespuesta recibida: " + arg);
				if (arg.equals("X")) { System.out.println("Finalizado!"); }
				
			}
		});
		new Thread(EventSource).start();
	}

}
