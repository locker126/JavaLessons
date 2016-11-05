package base.items;

import bases.Empaque;
import bases.Envoltura;

public abstract class Hamburguesa implements item {


	@Override
	public Empaque empaque() {
		// TODO Auto-generated method stub
		return new Envoltura();
	}

	@Override
	public abstract float precio() ;

    @Override
    public abstract String nombre();
}
