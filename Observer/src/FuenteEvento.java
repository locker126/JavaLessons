
import java.util.Observable;
import java.util.Scanner;

public class FuenteEvento extends Observable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true){
			
			
			System.out.println("Introducir evento");
			@SuppressWarnings({ "resource" })
			String respuesta = new Scanner(System.in).next();
			setChanged();
			notifyObservers(respuesta);
			if (respuesta.equals("X")) {
				break;
			}
			
		}
		
	}

}
