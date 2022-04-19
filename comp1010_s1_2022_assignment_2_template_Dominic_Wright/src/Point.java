/**
* DO NOT REMOVE THIS COMMENT
* STUDENT ID: 46358757
* STUDENT NAME: Dominic Wright
* [x ]: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
*/
/**	 	  			     		 		    		 	
 * Point class represents a point in a 2-diemensional plane.
 * 
 * x gives how far right is the point from the origin (0, 0) (negative means to the left)
 * y gives how far up is the point from the origin (0, 0) (negative means below)
 * 
 * @author gauravgupta
 *
 */	 	  			     		 		    		 	
public class Point {
	public int x, y;
	
	/**	 	  			     		 		    		 	
	 * DO NOT MODIFY
	 * @param x
	 * @param y
	 */	 	  			     		 		    		 	
	public Point(int x, int y) {	 	  			     		 		    		 	
		this.x = x;
		this.y = y;
	}	 	  			     		 		    		 	
	
	/**	 	  			     		 		    		 	
	 * DO NOT MODIFY
	 */	 	  			     		 		    		 	
	public String toString() {	 	  			     		 		    		 	
		return "("+x+","+y+")";
	}	 	  			     		 		    		 	
	
	/**	 	  			     		 		    		 	
	 * 
	 * @param other
	 * @return true i the calling object and the parameter object represent the same physical point
	 */	 	  			     		 		    		 	
	public boolean identical(Point other) {	 	  			     		 		    		 	
		if(this.x == other.x && this.y == other.y) {
			return true;
		}
		return false;
	}	 	  			     		 		    		 	
	
	/**	 	  			     		 		    		 	
	 * DO NOT MODIFY
	 * 
	 * @param other
	 * @return distance between the calling object and parameter object
	 */	 	  			     		 		    		 	
	public double distance(Point other) {	 	  			     		 		    		 	
		double dx = x - other.x;
		double dy = y - other.y;
		double sumSquares = dx*dx + dy*dy;
		return Math.sqrt(sumSquares);
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return quadrant to which point belongs
	 * For details: read https://en.wikipedia.org/wiki/Quadrant_(plane_geometry)
	 * Assume x=0 is in the right half and y=0 is in the top half
	 */	 	  			     		 		    		 	
	public int getQuadrant() {	
		if(x>=0 && y>=0) {
			return 1;
		}
		if(x<=0 && y>=0) {
			return 2;
		}
		if(x<0 && y<0) {
			return 3;
		}
		return 4;
	}	 	  			     		 		    		 	
	
	/**	 	  			     		 		    		 	
	 * 
	 * @param other
	 * @return 
	 * 1 if calling object is further from the origin than the parameter object
	 * -1 if calling object is closer to the origin than the parameter object
	 * 0 if calling object is the same distance from the origin as the parameter object
	 */	 	  			     		 		    		 	
	public int compareTo(Point other) {	
		//ensure all values are positive
		if(this.x < 0) {
			this.x = -this.x;
		}
		if(this.y < 0) {
			this.y = -this.y;
		}
		if(other.x < 0) {
			other.x = -other.x;
		}
		if(other.y < 0) {
			other.y = -other.y;
		}
		
		//sum the x and y values
		int thisDist = this.x+this.y;
		int otherDist = other.x+other.y;
		
		//compare the sum of x and y
		if(thisDist > otherDist) {
			return 1;
		}
		if(otherDist > thisDist) {
			return -1;
		}
		return 0;
	}	 	  			     		 		    		 	
	
	/**	 	  			     		 		    		 	
	 * IMPORTANT: neither calling object nor parameter object should be modified!
	 * @param other
	 * @return a Point that represents the calling object shifted by the parameter object.
	 * For example, when you shift (5, 3) by (2, -5), you get (7, -2)
	 */	 	  			     		 		    		 	
	public Point shift(Point other) {	
		int sumX = this.x+other.x;
		int sumY = this.y+other.y;
		
		Point shift = new Point(sumX, sumY);
		return shift;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * Calling object should NOT be modified.
	 * @return the Point when you flip the plane around the x-axis. 
	 * See tests for samples for better understanding of the problem.
	 */	 	  			     		 		    		 	
	public Point flipXAxis() {	 	  			     		 		    		 	
		int flipY = -y;
		Point flipped = new Point(x,flipY);
		return flipped;
	}	 	  			     		 		    		 	
	
	/**	 	  			     		 		    		 	
	 * Calling object should NOT be modified.
	 * @return the Point when you flip the plane around the y-axis. 
	 * See tests for samples
	 */	 	  			     		 		    		 	
	public Point flipYAxis() {	 	  			     		 		    		 	
		int flipX = -x;
		Point flipped = new Point(flipX, y);
		return flipped;
	}	 	  			     		 		    		 	
	
	/**	 	  			     		 		    		 	
	 * @param p1
	 * @param p2
	 * 
	 * @return true if calling object lies on the line segment that goes from p1 to p2.
	 * Note 1: that p1 and p2 themselves DO lie on that line.
	 * Note 2: if calling object lies on *projected* line segment, the function should return false.
	 * For example, 
	 * (2, 0) lies on the line segment from (0, 0) to (4, 0)
	 * (1, 2) does not lie on the line segment from (0, 0) to (4, 0)
	 * (12, 0) does not lie on the line segment from (0, 0) to (4, 0)
	 * (0, 0) lies on the line segment from (0, 0) to (4, 0)
	 * (4, 0) lies on the line segment from (0, 0) to (4, 0)
	 */	 	  			     		 		    		 	
	public boolean liesOn(Point p1, Point p2) {	
		//check if any of the objects are identical, return true if yes
		if(this.x == p1.x && this.y == p1.y || this.x == p2.x && this.y == p2.y) {
			return true;
		}
		if(this.x >= p1.x && this.x<= p2.x && this.y >= p1.y && this.y <= p2.y) {
			return true;
		}
		return false;
	}	 	  			     		 		    		 	
}
