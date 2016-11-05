package Main;

import java.util.ArrayList;
import java.util.List;

import Productos.CocaCola;
import Productos.HamburguesaPollo;
import casado.Casado;
import casado.CasadoBuilder;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
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
		*/
		int Tam = 5000;
		CasadoBuilder cb =  new CasadoBuilder();
		long start = System.currentTimeMillis();
		
		List<Casado> casados = new ArrayList<>();
		
		for (int i = 0 ; i<= Tam; i++){

			casados.add(cb.Vegeteriano());
		}
		float precioTotal = 0f;
		for (Casado C: casados){
			precioTotal += C.getCosto();
		}
		long end = System.currentTimeMillis();
		
		System.out.println("El precio total: " + String.format("%.2f", precioTotal));
		System.out.println("El tiempo es total: " + (end - start) + " ms.");
		
		
		long start1 = System.currentTimeMillis();
		
		List<Casado> casados1 = new ArrayList<>();
		CocaCola cc = new CocaCola();
		HamburguesaPollo hp = new HamburguesaPollo();
		for (int i = 0 ; i<= Tam; i++){
			casados1.add(cb.Normal(cc, hp));
			
		}
		float precioTotal1 = 0f;
		for (Casado C: casados){
			precioTotal1 += C.getCosto();
		}
		long end1 = System.currentTimeMillis();
		
		System.out.println("El precio total: " + String.format("%.2f", precioTotal1));
		System.out.println("El tiempo es total: " + (end1 - start1) + " ms.");
		
		
		
	}

}
