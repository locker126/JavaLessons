package casado;

import java.util.ArrayList;
import java.util.List;

import base.items.item;

public class Casado {
	private List<item> Items = new ArrayList<item>();
	
	public void AddItem(item i){
		Items.add(i);
	}
	
	public float getCosto(){
		float costo = 0;
		for (item i : Items){
			costo += i.precio();
		}
		return costo;
	}
	public void mostrarItems(){
		for (item i : Items){
			System.out.println("   Item: " + i.nombre());
			System.out.println("   Empaque: " + i.empaque().Empaquetar());
			System.out.println("   Precio: " + i.precio());
			System.out.println("--------------------");
			
		}
		
	}
	
	
}
