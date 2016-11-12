package ClasesImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class convertidor {
	@WebMethod
	public float celsiusToFarenheit(float celsius){
		float farenheit = (celsius * 9 / 5 ) + 32;
		return farenheit;
	}
	@WebMethod
	public float farenheitToCelsius(float farenheit){
		return (farenheit -32) * 5 /9;
		
	}
}
