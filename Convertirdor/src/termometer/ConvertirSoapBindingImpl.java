/**
 * ConvertirSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package termometer;

public class ConvertirSoapBindingImpl implements termometer.Convertir{
    public float farenheitToCelsius(float farenheit) throws java.rmi.RemoteException {
    	return (farenheit -32) * 5 /9;
    	
    }

    public float celsiusToFarenheit(float celsius) throws java.rmi.RemoteException {
    	float farenheit = (celsius * 9 / 5 ) + 32;
		return farenheit;
    }

}
