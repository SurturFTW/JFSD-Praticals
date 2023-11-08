package practical5b;

public class Shape {
	private Rectangle rectangle;

	public Shape(Rectangle rectangle) {
		this.rectangle = rectangle;
	}

	public void printShapeDetails() {
		System.out.println("Shape Details:");
		rectangle.printRectangleDetails();
	}
}
