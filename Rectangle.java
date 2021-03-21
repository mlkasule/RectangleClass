
public class Rectangle {

	private double width;
	private double height;

	/**
	 * no-arg to initialize the original values of width and height
	 */
	public Rectangle() {

		width = 1;
		height = 1;
	}

	/**
	 * constructor to assign the new width and new height
	 * 
	 * @param x the width
	 * @param y the height
	 */
	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	/**
	 * calculate the area
	 * 
	 * @return area
	 */
	public double getArea() {
		return width * height;
	}

	/**
	 * calculate the perimeter
	 * 
	 * @return the perimeter
	 */
	public double getPerimeter() {
		return (width * 2) + (height * 2);
	}

	/**
	 * return a string of results
	 */
	public String toString() {
		String str = "The area of a rectangle with width " + width + " and height " + height + " is " + getArea()
				+ "\nThe perimeter of a rectangle is " + getPerimeter();
		return str;
	}

}
