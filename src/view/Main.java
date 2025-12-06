package view;

import model.AreaCalculator;
import model.Circle;
import model.Rectangle;
import model.Square;
import model.Triangle;

public class Main {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5.0, 10.0);
		Circle circle = new Circle(8.5);
		Square sqre = new Square(12.0);
		Triangle triangle = new Triangle(10.0, 20.0);
		AreaCalculator calculator = new AreaCalculator();
		
		calculator.calculateArea(rect);
		calculator.calculateArea(circle);
		calculator.calculateArea(sqre);
		calculator.calculateArea(triangle);
		
		for (String shape : calculator.getAreas())
			System.out.println(shape);
	}
}
