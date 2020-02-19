import java.lang.Math.*;
import java.util.Vector;

public class Triangle extends Shape{


	public Triangle(ShapeDescription description) {
		super(description);
		Vector<Double> newvector = description.getDoubles();
		 sideA = newvector.get(0);
		 sideB = newvector.get(1);
		 sideC = newvector.get(2);
	}

	public Double sideA;
	public Double sideB; 
	public Double sideC;
	public double area;
	public double perimeter;


	public double getPerimeter() {

	 perimeter = (sideA + sideB + sideC);

		return perimeter;
	}

	public double getArea() {
		double s = ((getPerimeter())/2);
	  area = Math.sqrt(s*(s-sideA)* (s-sideB) * (s-sideC));
		return area;

	}

}


//remove abstract from function names and change class header to "extends shape"
//change function names to be the same as the shape class
//implement constructors for all the extended classes
