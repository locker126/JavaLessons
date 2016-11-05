import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HelloThread> thl = new ArrayList<HelloThread>();
		for (int i = 1; i <= 10; i++) {
			HelloThread th = new HelloThread(String.valueOf(i));
			th.setValor(i);
			th.setPriority(i);
			thl.add(th);
			
			
		}
		synchronized(thl){
			
			for (HelloThread th : thl){
				System.out.println("Ejecutando " + th.getValor());
				th.start();
				
				
			}
			/*for(int i = 0; i < 10; i++){
				HelloThread th = thl.get(i);
				th.start();				
				
			}*/
		}
				
	}

}
