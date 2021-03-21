/**
 * (The Rectangle class)
 * 
 * Following the example of the Circle class in Section 9.2, design a class
 * named Rectangle to represent a rectangle.
 * 
 * The class contains:
 * 
 * - Two double data fields named width and height that specify the width and
 * height of the rectangle. The default values are 1 for both width and height.
 * 
 * - A no-arg constructor that creates a default rectangle.
 * 
 * - A constructor that creates a rectangle with the specified width and height.
 * 
 * - A method named getArea() that returns the area of this rectangle.
 * 
 * - A method named getPerimeter() that returns the perimeter.
 * 
 * 
 * Draw the UML diagram for the class and then implement the class.
 * 
 * Write a test program that creates two Rectangle objects—one with width 4 and
 * height 40 and the other with width 3.5 and height 35.9.
 * 
 * Display the width, height, area, and perimeter of each rectangle in this
 * order.
 * 
 * @author Mark Kasue
 *
 */
public class Exercise09_01 {

	public static void main(String[] args) {

		// first= object created
		Rectangle one = new Rectangle(4.0, 40.0);
		System.out.println(one);

		// second object created
		Rectangle two = new Rectangle(3.5, 35.9);
		System.out.println(two);

	}

}

//WE CAN INCLUDE A CLASS HERE WITHOUT PUBLIC OR OPEN IN ANOTHER WINDOW WITH PUBLIC keyword
/**
 * class Rectangle {
 * 
 * private double width; private double height;
 * 
 * public Rectangle() {
 * 
 * width = 1; height = 1; }
 * 
 * public Rectangle(double x, double y) { width = x; height = y; }
 * 
 * public double getArea() { return width * height; }
 * 
 * public double getPerimeter() { return (width * 2) + (height * 2); }
 * 
 * public String toString() { String str = "The area of a rectangle with width "
 * + width + " and height " + height + " is " + getArea() + "\nThe perimeter of
 * a rectangle is " + getPerimeter(); return str; }
 * 
 * }
 * 
 **/
