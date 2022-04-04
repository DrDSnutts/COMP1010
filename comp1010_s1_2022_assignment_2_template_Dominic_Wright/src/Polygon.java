/**
* DO NOT REMOVE THIS COMMENT
* STUDENT ID: 46358757
* STUDENT NAME: Dominic Wright
* []: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
*/
public class Polygon {
	public Point[] points;

	/**	 	  			     		 		    		 	
	 * 
	 * @param x
	 * @param y
	 * 
	 * Populate the instance variable array, points, using the arrays x and y.
	 * Each corresponding pair in the two arrays; x[i], y[i]; represents one point.
	 * 
	 * use the first n items where n is the smaller of x.length and y.length
	 * 
	 * in case of either array being null, initialize the array to an empty one.
	 */	 	  			     		 		    		 	
	public Polygon(int[] x, int[] y) {	 	  			     		 		    		 	
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @param _points
	 * 
	 * Populate the instance variable array points with items of _points.
	 * 
	 * See the test data to determine null case scenario, etc.
	 * 
	 * Make sure all objects (including arrays) copying is done using instance copy, not reference copy.
	 */	 	  			     		 		    		 	
	public Polygon(Point[] _points) {	 	  			     		 		    		 	
	}	 	  			     		 		    		 	

	//DO NOT MODIFY!
	public String toString() {	 	  			     		 		    		 	

		String result = "("+points[0].x+", "+points[0].y+") -> ";
		for(int i=1; i < points.length; i++) {
			result+="("+points[i].x+", "+points[i].y+") -> ";
		}
		if(points.length > 1)
			result+="("+points[0].x+", "+points[0].y+")";
		else
			result = result.substring(0, result.length()-4);
		return result;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return index of the first point that has the same values for x and y coordinates
	 * return -1 if no such point exists.
	 */	 	  			     		 		    		 	
	public int firstPointWithSameXY() {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return index of the last point that lies on the origin (0, 0)
	 * return -1 if no such point exists.
	 */	 	  			     		 		    		 	
	public int lastPointAtOrigin() {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return true if every point is further from origin than the last point,
	 * false otherwise.
	 */	 	  			     		 		    		 	
	public boolean goingFurtherFromOrigin() {	 	  			     		 		    		 	
		return false;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return the sum of all sides of the polygon
	 * first point to second, 
	 * second point to third,
	 * second last point to last,
	 * last point back to first
	 */	 	  			     		 		    		 	
	public double circumference() {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return index of the first point that is on origin (0, 0).
	 * return -1 if no such point exists.
	 */	 	  			     		 		    		 	
	public int firstPointOnOrigin() {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return index of the last point that has the same values for x and y coordinates
	 * return -1 if no such point exists.
	 */	 	  			     		 		    		 	
	public int lastPointWithSameXY() {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 *
	 * An edge is the line between two adjacent vertices/points in a polygon.
	 * @return the length of the longest edge.
	 * For example if there are three consecutive points (2,3) -> (7,3) -> (8,3),
	 * then (2,3) -> (7,3) is one side, and (7,3) -> (8,3) is a second side.
	 */	 	  			     		 		    		 	
	public double longestEdge() {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @param minLength
	 * @param maxLength assume maxLength >= minLength
	 * @return number of edges in the polygon that have a length between the two lengths
	 * (inclusive on both sides)
	 */	 	  			     		 		    		 	
	public int countEdgesBetween(int minLength, int maxLength) {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return index of the point that is closest to the origin, which is (0, 0)
	 * In case of a tie, return the lowest index
	 */	 	  			     		 		    		 	
	public int closestToOriginIndex() {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @param q (between 1 and 4)
	 * @return the index of the first point that is in quadrant q.
	 * return -1 if no such point exists.
	 */	 	  			     		 		    		 	
	public int firstPointInQuadrant(int q) {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	


	/**	 	  			     		 		    		 	
	 * 
	 * @return true if all points of the polygon are in the same quadrant, false otherwise
	 * 
	 */	 	  			     		 		    		 	
	public boolean inSingleQuadrant() {	 	  			     		 		    		 	
		return false;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @param p
	 * @return number of points that are further from the origin than point p is. 
	 */	 	  			     		 		    		 	
	public int countPointsFurtherThan(Point p) {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * @return a 2-dimensional array containing points.length subarrays,
	 * each containing two items.
	 * first subarray contains points[0].x, points[0].y
	 * second subarray contains points[1].x, points[1].y
	 * and so on
	 */	 	  			     		 		    		 	
	public int[][] get2DArray() {	 	  			     		 		    		 	
		return null;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * HD - 1
	 * @return number of points that are *essential*.
	 * Now, what is a NON-essential point?
	 * Say, there are three adjacent points on the polygon such that,
	 * points[i].x, points[i].y = 2, 3
	 * points[i+1].x, points[i+1].y = 6, 2
	 * x[i+2], y[i+2] = 14, 0
	 * 
	 * You will notice they all lie on a straight line and that 
	 * (6, 2) lies between (2, 3) and (14, 0).
	 * Hence point (6, 2) can be removed from the polygon 
	 * while maintaining the shape of the polygon,
	 * and is called NON-essential.
	 * 
	 * So, any point that lies on the line segment connecting 
	 * the two points (one before and one after it) is NON-essential
	 */	 	  			     		 		    		 	
	public int countEssentialPoints() {	 	  			     		 		    		 	
		return 0;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * HD - 2
	 * @return a Polygon object containing only essential points.
	 * Note the calling object should not be modified.
	 * Please see test for a better understanding of the problem.
	 */	 	  			     		 		    		 	
	public Polygon getOptimized() {	 	  			     		 		    		 	
		return null;
	}	 	  			     		 		    		 	
}