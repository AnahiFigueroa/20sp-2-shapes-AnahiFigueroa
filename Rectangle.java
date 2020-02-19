import java.util.Vector;

public class Rectangle extends Shape{

	int width;
	int height;

	public double getArea() {

		double area = 0;
		area = width * height;


		returns area;

	}
	public double getPerimeter() {

		double perimeter = 0;
		perimeter = 2 * (width + height);


		returns perimeter;
	}

	public Rectangle(ShapeDescription description) {
		super(description);
		Vector<Double> newvector = description.getDoubles();
		width = newvector.get(0);
		height = newvector.get(1);

	}

}
