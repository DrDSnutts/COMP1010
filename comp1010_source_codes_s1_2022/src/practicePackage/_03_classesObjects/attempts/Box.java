package practicePackage._03_classesObjects.attempts;

/**
 * 
 * @author gauravgupta
 * Box represents a three dimensional cuboid. We use the front perspective
 * such that 
 * the side from front to back is depth
 * the side from top to bottom is height
 * the side from left to right is width
 * 
 * IMPORTANT: Do NOT override equals()
 */
public class Box {
	public int depth, height, width;

	/**
	 * 
	 * NOTE: if any of the values are less than 1, they should be made 1 before copying into 
	 * corresponding instance variable
	 * @param d (for depth)
	 * @param h (for height)
	 * @param w (for width)
	 */
	public Box(int d, int h, int w) {
		if( d < 1) {
			d = 1;
		}
		if( h < 1) {
			h = 1;
		}
		if(w < 1) {
			w = 1;
		}
		depth = d;
		height = h;
		width = w;
	}

	/**
	 * copy constructor to create an instance copy of the passed object
	 * @param original
	 */
	public Box(Box original) {
		this.depth = original.depth;
		this.height = original.height;
		this.width = original.width;
	}

	/**
	 * @return String representation. 
	 * for example, if depth = 3, height = 2, width = 5, it should return
	 * "3 x 2 x 5"
	 */
	public String toString() {
		String str = depth + " x " + height + " x " + width;
		return str;
	}

	/**
	 * 
	 * @return the volume of the box
	 */
	public int volume() {
		return depth*height*width;
	}
	
	/**
	 * 
	 * @return the longest side of the box
	 */
	public int longestSide() {
		if(width > height && width > depth) {
			return width;
		}
		if(depth > width && depth > height) {
			return depth;
		}
		return height;
	}

	/**
	 *
	 * @return area of the base (or the top)
	 */
	public int baseArea() {
		return depth*width;
	}

	/**
	 * 
	 * @return area of the front (or the back face)
	 */
	public int frontArea() {
		return height*width;
	}

	/**
	 * 
	 * @return area of the left (or right) face
	 */
	public int sideArea() {
		return height*depth;
	}

	/**
	 * 
	 * @return the surface area of the box
	 */
	public int surfaceArea() {
		return (sideArea() + frontArea() + baseArea())*2; 
	}

	/**
	 * 
	 * @return the area of the largest surface (base/front/side)
	 */
	public int largestFaceArea() {
		if(sideArea() > frontArea() && sideArea() > baseArea()) {
			return sideArea();
		}
		if(frontArea() > sideArea() && frontArea() > baseArea()) {
			return frontArea();
		}
		return baseArea();
	}

	/**
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * comparison criteria: volume -> surface area
	 *
	 */
	public int compareTo(Box other) { //volume -> surface area
		if(this.volume() > other.volume() || this.surfaceArea() > other.surfaceArea()) {
			return 1;
		}
		if(this.volume() < other.volume() || this.surfaceArea() < other.surfaceArea()) {
			return -1;
		}
		return 0;
	}

	/**
	 * D
	 * @param b
	 * @return true if the box represented by the calling object
	 * can fit inside the box represented by the parameter object, false otherwise.
	 * Note that a box cannot fit inside the box of the same dimension.
	 */
	public boolean canFitInside(Box b) {
		if(this.depth < b.depth && this.height < b.height && this.width < b.width) {
			return true;
		}
		double dia = pythag(this.height, this.depth);
		double diab = pythag(b.height, b.depth);
		
		if(dia < diab && this.width < b.width) {
			return true;
		}
		//box b = 5.385
		return false;
	}
	
	public double pythag(int a, int b) {
		double t;
		double c = a*a + b*b;
		double sqrt = c/2;
		do {
			t = sqrt;
			sqrt = (t+(c/t))/2;
		}
		while ((t-sqrt) != 0);
			return sqrt;
		
	}

	/**
	 * D
	 * @param other
	 * @return true if the calling object is identical to
	 * the parameter object when orientation is not considered.
	 * so 3 x 2 x 5 and 5 x 2 x 3 are identical. 
	 */
	public boolean isIdenticalTo(Box other) {
		return true;	
	}
	
	/**
	 * HD
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * comparison criteria: volume -> surface area -> longest sides -> second longest sides -> shortest side
	 */
	public int compareToAdvanced(Box other) { 
		return 0;
	}
}
