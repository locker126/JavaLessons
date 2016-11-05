package Factoring;

import color.factory.Color;
import color.factory.Colores;
import formas.*;

public class ShapeFactory extends AbstractFactory {

	public shape getShape(Formas forma){
		
		if (forma == Formas.CIRCULO) {
			return new Circle();
		} else if (forma == Formas.RECTANGULO) {
			return new Rectangle();
		} else 	if (forma == Formas.CUADRADO) {
			return new Square();
		} else {
			return null;
			
		}
		
		
		
		// TODO Auto-generated constructor stub
		
			
		
	}

	@Override
	public Color getColor(Colores color) {
		// TODO Auto-generated method stub
		throw new ClassCastException("Formas no pueden crear colores");
	}


	
}
