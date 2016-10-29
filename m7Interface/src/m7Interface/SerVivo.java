package m7Interface;

public class SerVivo implements IDesplazable {
	public String Tipo = "";
	
	public SerVivo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		System.out.println("Como soy un " + Tipo + " yo me muevo ...");
	}

	@Override
	public void moverse(int x) {
		// TODO Auto-generated method stub
		System.out.println("Como soy un " + Tipo + " yo me muevo " + x + " metros" );	
	}

}
