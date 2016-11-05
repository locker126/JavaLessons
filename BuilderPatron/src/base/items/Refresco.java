package base.items;

import bases.Botella;
import bases.Empaque;
import bases.Envoltura;

public abstract class Refresco implements item {
	
	@Override
	public Empaque empaque() {
		// TODO Auto-generated method stub
		return new Botella();
	}

	@Override
	public abstract float precio() ;
	

}
