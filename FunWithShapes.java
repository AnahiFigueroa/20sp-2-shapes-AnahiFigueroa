
public class FunWithShapes extends ShapeHandler {

	public FunWithShapes () throws ShapeException {
		
		super(); 
		
	}
	
	/**
	 * Given the shapeDescriptions, converts it to a vector
	 * of actual shape objects.
	 */
	public void convertDescriptionsToShapes() {
		shapes = new Vector<shape>();
		
		for (ShapeDescription sd: shapeDescriptions) {
			if (sd.getShapeType() == ShapeDescription.ShapeTypes.CIRCLE) {
				Shape shape = new Circle(sd); 
				shapes.add(shape); 
				
			}
			else if (sd.getShapeType() == ShapeDescription.ShapeTypes.SQUARE) {
				Shape shape = new Square(sd); 
				shapes.add(shape); 
				
			}
			
			else if (sd.getShapeType() == ShapeDescription.ShapeTypes.TRIANGLE) {
				Shape shape = new Triangle(sd); 
				shapes.add(shape); 
			}
			
			else if (sd.sdgetShapeType() == ShapeDescription.ShapeTypes.RECTANGLE) {
				Shape shape = new Rectangle(sd); 
				shapes.add(shape); 
			}
			
		}
	}

	
	
	/**
	 * Computes the sum of the shapes' areas, where the shapes
	 * are from the shapes list
	 * @return the sum of the shapes' areas
	 */
	public double sumOverAreas() {
		double areas = 0.0; 
		for (Shape s: shapes) {
			areas += s.getArea(); 
		}
			
		
	}
	
	/**
	 * Computes the sum of the shapes' perimeters, where the shapes
	 * are from the shapes list
	 * @return the sum of the shapes' perimeters
	 */
	public double sumOverPerimeters() {
		double perimeter = 0.0; 
		for (Shape s: shapes) {
			perimeter += s.getPerimeter(); 
		}
	}


	
	
}
