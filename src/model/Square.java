package model;

public class Square implements Shape{
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}

	@Override
	public Double calculateArea() {
		return getSide() * getSide();
	}

	@Override
	public String getForm() {
		return "Square";
	}
}
