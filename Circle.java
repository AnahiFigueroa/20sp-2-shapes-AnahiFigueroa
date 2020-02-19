import java.lang.Math.*;
import java.util.Vector;


public class Circle extends Shape {
	
	public Circle(ShapeDescription description) {
		super(description);
		Vector<Double> newvector = description.getDoubles();
		radius = newvector.get(0);

	}

	public double radius;
	public double area;
	public double perimeter;

	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}


	public double getPerimeter() {
		double perimeter = 2 * (Math.PI * radius);
		return perimeter;
 	}
	

}