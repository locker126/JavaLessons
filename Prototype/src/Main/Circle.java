package Main;

public class Circle extends Shape {
	private int id = 0;
	@Override
	public void draw() {
		System.out.println("Dibujando Circulo...");
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
