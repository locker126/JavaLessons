import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 15; i++){
			Multihilo ct = new Multihilo("Hilo" + i);
			executor.execute(ct);
			
		}
		executor.shutdown();
		while(executor.isTerminated() ){
			System.out.println("Finalizado!");
			
		}
		
	}

}
