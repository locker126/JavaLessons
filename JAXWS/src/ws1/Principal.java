package ws1;

import javax.xml.ws.Endpoint;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uri = "http://localhost:8080/HolaMundo";
		System.out.println("Iniciando Web Service...");
		Endpoint.publish(uri, new HolaMundoImp());
		System.out.println("Web Service Iniciado en: " + uri);
	}

}
