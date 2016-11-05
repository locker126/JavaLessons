package Main;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.setId(1);
		System.out.println("C id = " +  c.getId());
		Circle g = (Circle) c.clone();
		System.out.println("G id = " +  g.getId());
		g.setId(2);
		System.out.println("C id = " +  c.getId());
		System.out.println("G id = " +  g.getId());
		
		
	}

}
