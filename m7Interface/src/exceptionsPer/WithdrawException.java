package exceptionsPer;

@SuppressWarnings("serial")
public class WithdrawException extends Exception {

	public WithdrawException() {
		
		// TODO Auto-generated constructor stub
		super("Ha ocurrido error en su deposito");
	}
	public WithdrawException (String mensaje){
		super(mensaje);
		
	}

}
