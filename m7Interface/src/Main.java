import exceptionsPer.*;

public class Main {
	private CtaBanco MiCta = new CtaBanco();
	public Main() {
		// TODO Auto-generated constructor stub
		MiCta.Deposit(5000);
		System.out.println("Al momento de crear la clase la cuenta tiene : " + String.valueOf(MiCta.Balance() + " Colones."));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Main Ejercicio = new Main();
			
			Ejercicio.MiCta.Deposit(5000);
			System.out.println("Al momento de instanciar la clase la cuenta tiene : " + String.valueOf(Ejercicio.MiCta.Balance() + " Colones."));
			
			try {
				Ejercicio.MiCta.Withdraw(50000);
			}	catch (WithdrawException e) {
				System.out.print(e.getMessage());
			}
			
	}

}
