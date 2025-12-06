package model;

public class Triangle implements Shape {

	private Double base;
	private Double height;
	
	public Triangle(Double base, Double height) {
		this.base = base;
		this.height = height; 
	}
	
	public Double getHeight() {
		return height;
	}
	public Double getBase() {
		return base;
	}

	@Override
	public Double calculateArea() {
		return base * height / 2;
	}

	@Override
	public String getForm() {
		return "Triangle";
	}
}
