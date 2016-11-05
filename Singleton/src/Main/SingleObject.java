package Main;

import java.util.Calendar;

public class SingleObject {
	private static SingleObject instance = null;
	public String NomInstancia = "";
	protected SingleObject(){
		Calendar calendario = Calendar.getInstance();
		int hora, minutos, segundos;
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		NomInstancia = "Hora de creacion: hora:" + hora + "; Minutos: " + minutos + " Segundos:" + segundos;  
		
		
	}
	public static SingleObject getInstance() {
		if (instance == null){
			instance = new SingleObject();
		}
		return instance;
	}
}
