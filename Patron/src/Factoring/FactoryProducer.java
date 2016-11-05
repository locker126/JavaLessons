package Factoring;

public class FactoryProducer {

	public static AbstractFactory getFactory(String f){
		if (f.equalsIgnoreCase("shapefactory")){
			return new ShapeFactory();
		} else {
			if (f.equalsIgnoreCase("colorfactory")){
				return new ColorFactory();
			} else {
				return new ShapeFactory();	
			}
			
		}
	}
	

}
