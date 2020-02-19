import java.lang.Math.*;
import java.util.Vector;

public class Triangle extends Shape{


	public Triangle(ShapeDescription description) {
		super(description);
		Vector<Double> newvector = description.getDoubles();
		Double sideA = newvector.get(0);
		Double sideB = newvector.get(1);
		Double sideC = newvector.get(2);
	}

	Double sideA;
	Double sideB;
	Double sideC;


	public double getPerimeter() {
		double perimeter = sideA + sideB + sideC;
		return perimeter;
	}

	public double getArea() {
		double s = (getPerimeter()/2);
		double area = Math.sqrt(s*(s-sideA)* (s-sideB) * (s-sideC));
		return area;

	}

}


//remove abstract from function names and change class header to "extends shape"
//change function names to be the same as the shape class
//implement constructors for all the extended classes
