import java.lang.Math.*;
import java.util.Vector;


public class Square extends Shape {
	
	public Square(ShapeDescription description) {
		super(description);
		Vector<Double> newvector = description.getDoubles();
		sideLength = newvector.get(0);

	}

	Double sideLength;

	public double getArea() {

		double area = sideLength * sideLength;

		return area;

	}
	public double getPerimeter() {

		double perimeter = 2 * (sideLength + sideLength);

		return perimeter;

	}


	

}

