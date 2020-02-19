import java.util.Vector;


public class Rectangle extends Shape{
	
	public Rectangle(ShapeDescription description) {
		super(description);
		Vector<Double> newvector = description.getDoubles();
		width = newvector.get(0);
		height = newvector.get(1);

	}

	Double width;
	Double height;

	public double getArea() {

		double area = 0;
		area = width * height;
		return area;

	}
	public double getPerimeter() {

		double perimeter = 0;
		perimeter = 2 * (width + height);
		return perimeter;
	}

	

}