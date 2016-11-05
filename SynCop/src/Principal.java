
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*Cliente c = new Cliente();
			
			new Thread(){
				public void run (){
					c.retiro(1500);
					
				}
			}.start();
			new Thread(){
				public void run (){
					c.deposit(400);
					
				}
			}.start();
			new Thread(){
				public void run (){
					c.deposit(400);
					
				}
			}.start();
			new Thread(){
				public void run (){
					c.deposit(400);
					
				}
			}.start();
			
			new Thread(){
				public void run (){
					c.deposit(200);
					
				}
			}.start();
			new Thread(){
				public void run (){
					c.deposit(200);
					
				}
			}.start();*/
		Contador c = new Contador();
		c.start();
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		c.interrupt();
			
	}

}
