package casado;

import Productos.CocaCola;
import Productos.HamburguesaPollo;
import Productos.HamburguesaSoya;

public class CasadoBuilder {

	
	public Casado Vegeteriano(){
		Casado casado1 = new Casado();
		casado1.AddItem(new CocaCola());
		casado1.AddItem(new HamburguesaSoya());
		return casado1;
	}
	
	public Casado Normal(){
		Casado casado1 = new Casado();
		casado1.AddItem(new CocaCola());
		casado1.AddItem(new HamburguesaPollo());
		return casado1;
	}
	
	
}
