package Factoring;

import color.factory.*;
import color.factory.Color;

import formas.Formas;

import formas.shape;

public class ColorFactory extends AbstractFactory{

	

	@Override
	public Color getColor(Colores color) {
		
		

if (color == Colores.AZUL) {
	return new Blue();
} else if (color == Colores.VERDE) {
	return new Green();
} else 	if (color == Colores.ROJO) {
	return new Red();
} else {
	return null;
	
}
		
	
		}
	

	@Override
	public shape getShape(Formas forma) {
		// TODO Auto-generated method stub
		throw new ClassCastException("Colores no pueden crear formas");
	}

}
