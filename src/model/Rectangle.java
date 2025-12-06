package model;

public class Rectangle implements Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public Double calculateArea() {
		return getWidth() * getHeight();
	}

	@Override
	public String getForm() {
		return "Rectangle";
	}
}
