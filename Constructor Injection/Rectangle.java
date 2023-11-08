package practical5b;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void printRectangleDetails() {
		System.out.println("Rectangle: Length = " + length + ", Width = " + width);
	}
}