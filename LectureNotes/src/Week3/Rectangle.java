package Week3;

public class Rectangle {
	//attributes that represent the state
	//attributes: instance variables
	public double length, breadth;
	
	//functions
	//functions: instance methods
	
	//constructor
	//1. no return type (not even void)
	//2. same name as class (case sensitive)
	public Rectangle(double len, double bre) {
		length = len;
		if(length < 0) {
			length = 0;
		}
		breadth = bre;
		if(breadth <0) {
			breadth = 0;
		}
	}
	
	public Rectangle(double side) {
		length = side;
		if(length<0) {
			length = 0;
		}
		breadth = length;
	}
	
	public double area() {
		double result = length * breadth;
		return result;
	}
	
	public boolean isSquare() {
		boolean result = length == breadth;
		return result;
	}
	
	public double getShortSide() {
		if(length < breadth) {
			return length;
		}
		return breadth;
	}

	/**
	 * 
	 * @param factor
	 * 
	 * resize by given factor.
	 * 
	 * Examples: if factor = 0.5, length and breadth both get halved,
	 * if factor = 1.5, length and breadth increase by 50%
	 */
	 public void resize() {
		 
	 }
}
