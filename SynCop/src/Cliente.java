
	public class Cliente {
		int balance = 0;
		synchronized void deposit(int monto){
			System.out.println("Iniciando Deposito");
			balance += monto;
			System.out.println("Deposito Completo, nuevo saldo = " + balance);
			notifyAll();
		}
		synchronized void retiro (int monto){
			
			System.out.println("Iniciando retiro por: " + monto);
			if (balance < monto) {
				System.out.println("Fondos Insuficientes! Esperando deposito");
				try {
					wait();
					this.retiro(monto);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else {
				balance -= monto;
				System.out.println("Retiro Completo, nuevo saldo = " + balance);	
				
			}
			
			
			
			
			
		}
}
