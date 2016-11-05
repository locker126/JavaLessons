
	public class Table {
		synchronized static void printTable(int n){
			System.out.println("Ejecutando tabla del " + n );
			for ( int i = 1; i<= 10; i++){
				System.out.println(n*i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
}
