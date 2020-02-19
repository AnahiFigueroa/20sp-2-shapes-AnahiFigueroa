import java.lang.Math.*;
import java.util.Vector;


public class Square extends Shape {
	
	int sideLength; 
	
	public double getArea() {
		
		double area = sideLength * sideLength; 
		
		returns area; 
		
	}
	public double getPerimeter() {
		
		double perimeter = 2 * (sidelength + sidelength); 
		
		returns perimeter; 

	}
	
	
	public Square(ShapeDescription description) {
		super(description); 
		Vector<Double> newvector = description.getDoubles(); 
		sideLength = newvector.get(0); 
	
	}
}
	  
}
