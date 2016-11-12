package termometer;

public class Convertir {

	public float celsiusToFarenheit(float celsius){
		float farenheit = (celsius * 9 / 5 ) + 32;
		return farenheit;
	}
	
	public float farenheitToCelsius(float farenheit){
		return (farenheit -32) * 5 /9;
		
	}
	
}
