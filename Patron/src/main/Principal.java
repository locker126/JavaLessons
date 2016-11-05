package main;

import Factoring.AbstractFactory;
import Factoring.FactoryProducer;
import color.factory.Color;
import color.factory.Colores;
import formas.shape;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AbstractFactory FactColor = FactoryProducer.getFactory("ColorFactory");
		AbstractFactory ShapColor = FactoryProducer.getFactory("ShapeFactory");
		shape Prueba = ShapColor.getShape(formas.Formas.RECTANGULO);
		Color Tes = FactColor.getColor(color.factory.Colores.VERDE);
		try
		{
			

			
			Color Prueba1 = ShapColor.getColor(Colores.AZUL);
			Prueba1.fill();
			
		}
		catch(ClassCastException e){
			System.out.println(e.getMessage());
			
		}
		Prueba.draw();
		
		Tes.fill();
		

	}

}
