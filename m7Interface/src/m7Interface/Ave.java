package m7Interface;

public class Ave extends SerVivo {

	public Ave() {
		// TODO Auto-generated constructor stub
		this.Tipo = "Ave";
	}
	
	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		System.out.println("Como soy un " + Tipo + " yo vuelo ...");
	}

	@Override
	public void moverse(int x) {
		// TODO Auto-generated method stub
		System.out.println("Como soy un " + Tipo + " yo vuelo " + x + " metros" );	
	}
	
	

}
