/**
 * 
 */
package exceptionsPer;

/**
 * @author JAVA
 *
 */
public class CtaBanco {
	private double Fondos = 0;

	/**
	 * 
	 */
	public CtaBanco() {
		// TODO Auto-generated constructor stub
		this.Fondos = 0;
				
				
	}
	
	public CtaBanco (String Numero){
		
		this.Fondos = 0;
	}
	
	public void Withdraw(double amount) throws WithdrawException
	{
		if (this.Fondos < amount) {
			throw new WithdrawException("Fondos Insuficientes");
		} else {
			this.Fondos -= amount;
		}
	}
	public void Deposit(double amount){
		this.Fondos += amount;
		
	}
	public double Balance(){
		return this.Fondos;
	}

}
