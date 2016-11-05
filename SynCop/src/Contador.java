
public class Contador extends Thread {
	
	@Override
	public void run(){
		int n = 0;
		while(true)
		{
			n++;
			System.out.println(n);
			if(isInterrupted()){ break;}
		}
	}
}
