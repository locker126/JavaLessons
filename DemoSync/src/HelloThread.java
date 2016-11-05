
public class HelloThread extends Thread {
	private int Valor =1 ;
	HelloThread (String x){
		System.out.println("Tabla del " + x);
	}
	 public void run() {
		 Table.printTable(Valor);
	    }

		public void setValor(int valor) {
			Valor = valor;
		}
		public int getValor(){
			return Valor;
		}
}
