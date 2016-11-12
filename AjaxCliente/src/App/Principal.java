package App;

import java.rmi.RemoteException;

import ws1.HelloWorldProxy;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldProxy ws = new HelloWorldProxy();
		
		try {
			String salida = ws.holaMundo("Mario");
			System.out.println(salida);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}



}

