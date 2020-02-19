import java.lang.Math.*;
import java.util.Vector;



public class Triangle extends Shape{


	int sideA;
	int sideB;
	int sideC;
	public double getArea() {
		double s = (getPerimeter()/2);
		double area = Math.sqrt(s*(s-sideA)* (s-sideB) * (s-sideC));
		return area;

	}
	public double getPerimeter() {
		double perimeter = sideA + sideB + sideC;
		returns perimeter;
	}


	public Trangle(ShapeDescription description) {
		super(description);
		Vector<Double> newvector = description.getDoubles();
		sideA = newvector.get(0);
		sideB = newvector.get(1);
		sideC = newvector.get(2);
	}
}


//remove abstract from function names and change class header to "extends shape"
//change function names to be the same as the shape class
//implement constructors for all the extended classes
