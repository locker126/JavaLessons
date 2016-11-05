package Main;

import Productos.CocaCola;
import Productos.HamburguesaPollo;
import casado.Casado;
import casado.CasadoBuilder;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Casado casado2 = new Casado();
		casado2.AddItem(new CocaCola());
		casado2.AddItem(new HamburguesaPollo());
		casado2.mostrarItems();
		float costo = casado2.getCosto();
		
		System.out.println("Total: " + costo);
		System.out.println("====================");
		
		CasadoBuilder cb =  new CasadoBuilder();
		
		Casado casado1 = cb.Vegeteriano();
		casado1.mostrarItems();
		float costo1 = casado1.getCosto();
		
		System.out.println("Total: " + costo1);
		System.out.println("====================");
		
	}

}
