package ws1;

import javax.jws.WebService;

@WebService(endpointInterface="ws1.HelloWorld", targetNamespace="http://localhost:8080/HolaMundo")
public class HolaMundoImp implements HelloWorld {

	@Override
	public String holaMundo(String nombre) {
		// TODO Auto-generated method stub
		return "Hola " + nombre;
	}


	

}
