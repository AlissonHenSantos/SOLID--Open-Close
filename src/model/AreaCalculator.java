package model;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {

	private List<String> areas = new ArrayList<String>();

	public double calculateArea(Shape shape) {
		
		areas.add(String.format("Forma: %s com area: %.2f", shape.getForm(), shape.calculateArea()));
		
		return shape.calculateArea();
	}

		
	
	public List<String> getAreas() {
		return new ArrayList<String>(areas);
	}
}
