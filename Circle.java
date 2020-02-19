import java.lang.Math.*;
import java.util.Vector;

public class Circle extends Shape {

	public double radius;
	public double getArea() {
		return area;
	}

	@Override
	public double getPerimeter() {
		return perimeter;
	}

  @Override
	public double CircleArea(){
 	 double area = Math.PI * (radius * radius);
  }

   public double CirclePerimeter(){
 		double perimeter = 2 * (Math.PI * radius);
 	}

	public Circle(ShapeDescription description) {
		super(description);
		Vector<Double> newvector = description.getDoubles();
		radius = newvector.get(0);

	}
}
