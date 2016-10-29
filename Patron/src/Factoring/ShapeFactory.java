package Factoring;

import formas.*;

public class ShapeFactory {

	public shape getShape(String forma){
		
		switch (forma) {
		case "Circle":
			return new Circle();
		case "Rectangle":
			return new Rectangle();
		case "Square":
			return new Square();
		default:
			return new Circle();
		
		
		}
		
		
		// TODO Auto-generated constructor stub
		
			
		
	}

}
