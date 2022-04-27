/**
 * DO NOT REMOVE THIS COMMENT
 * STUDENT ID: 46358757
 * STUDENT NAME: Dominic Wright
 * [x]: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
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
		if(x == null || y == null) {
			points = new Point[0];
			x = new int[0];
			y = new int[0];
		}
		
		if(x.length <= y.length) {
			points = new Point[x.length];	
		}
		
		if(y.length <= x.length) {
			points = new Point [y.length];	
		}
		
		for(int i = 0; i<points.length; i++) {
			points[i] = new Point(x[i], y[i]);
		}

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
		if(_points == null) {
			points = new Point[0];
		}
		if(_points != null) {
			points = new Point[_points.length];
		}

		for(int i = 0; i<points.length; i++) {
			points[i] = new Point (_points[i].x, _points[i].y);
		}
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
		for(int i = 0; i<points.length; i++) {
			if(points[i].x == points[i].y) {
				return i;
			}
		}
		
		return -1;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return index of the last point that lies on the origin (0, 0)
	 * return -1 if no such point exists.
	 */	 	  			     		 		    		 	
	public int lastPointAtOrigin() {	 	  			     		 		    		 	
		for(int i = points.length-1; i>0; i--) {
			if(points[i].x == 0 && points[i].y == 0) {
				return i;
			}
		}
		
		return -1;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return true if every point is further from origin than the last point,
	 * false otherwise.
	 */	 	  			     		 		    		 	
	public boolean goingFurtherFromOrigin() {	
		int counter = 1;
		for(int i = 1; i < points.length; i++) {
			if(points[i-1].x + points[i-1].y < points[i].x + points[i].y) {
				counter++;
			}
		}
		
		if(counter == points.length) {
			return true;
		}
		
		return false;
	}	 	

	public int absoluteVal(int n) {
		if(n < 0) {
			return -n;
		}
		else {
			return n;
		}
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
		double distance = 0;
		double sum = 0;
		double lastSide = distance(points[0].x, points[0].y, points[points.length-1].x, points[points.length-1].y); //last side of the polygon is hardcoded as it is from the last index to the first index
		
		//sums the distance of all sides except the last side
		for(int i = 1; i<points.length; i++) {
			distance = distance(points[i-1].x, points[i-1].y, points[i].x, points[i].y);
			sum = sum + distance;
		}
		
		return sum+lastSide;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return index of the first point that is on origin (0, 0).
	 * return -1 if no such point exists.
	 */	 	  			     		 		    		 	
	public int firstPointOnOrigin() {	 	  			     		 		    		 	
		for(int i = 0; i<points.length; i++) {
			if(points[i].x == 0 && points[i].y == 0) {
				return i;
			}
		}
		return -1;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return index of the last point that has the same values for x and y coordinates
	 * return -1 if no such point exists.
	 */	 	  			     		 		    		 	
	public int lastPointWithSameXY() {	
		for(int i = points.length-1; i > 0; i--) {
			if(points[i].x == points[i].y) {
				return i;
			}
		}
		return -1;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 *
	 * An edge is the line between two adjacent vertices/points in a polygon.
	 * @return the length of the longest edge.
	 * For example if there are three consecutive points (2,3) -> (7,3) -> (8,3),
	 * then (2,3) -> (7,3) is one side, and (7,3) -> (8,3) is a second side.
	 */	 	  			     		 		    		 	
	public double longestEdge() {	
		double d1 = 0;
		double d2 = 0;
		double d3 = distance(points[0].x, points[0].y, points[points.length-1].x, points[points.length-1].y);

		for(int i = 0; i<points.length-1; i++) {
			d1 = distance(points[0].x, points[0].y, points[1].x, points[1].y);
			d2 = distance(points[i].x, points[i].y, points[i+1].x, points[i+1].y);
			if(d2>d1) {
				d1 = d2;
			}
		}

		if(d3>d1) {
			d1 = d3;
		}
		return d1;
	}	 

	public double distance(int x1, int y1, int x2, int y2) {
		double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2-x1));
		return distance;
	}

	/**	 	  			     		 		    		 	
	 * 
	 * @param minLength
	 * @param maxLength assume maxLength >= minLength
	 * @return number of edges in the polygon that have a length between the two lengths
	 * (inclusive on both sides)
	 */	 	  			     		 		    		 	
	public int countEdgesBetween(int minLength, int maxLength) {	
		int count = 0;

		for(int i = 0; i<points.length-1; i++) {
			double sideLength = distance(points[i].x, points[i].y, points[i+1].x, points[i+1].y);
			if( sideLength < maxLength && sideLength > minLength) {
				count++;
			}
		}
		
		return count;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return index of the point that is closest to the origin, which is (0, 0)
	 * In case of a tie, return the lowest index
	 */	 	  			     		 		    		 	
	public int closestToOriginIndex() {	 
		int minIndex = 0;
		
		for(int i = 0; i<points.length-1; i++) {
			if(distance(0,0, points[i].x, points[i].y) < distance(0,0, points[i+1].x, points[i+1].y)) {
				return minIndex;
			}
			else {
				minIndex++;
			}
		}
		
		return minIndex;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @param q (between 1 and 4)
	 * @return the index of the first point that is in quadrant q.
	 * return -1 if no such point exists.
	 */	 	  			     		 		    		 	
	public int firstPointInQuadrant(int q) {	 	  			     		 		    		 	
		for(int i = 0; i<points.length; i++) {
			if(points[i].getQuadrant() == q) {
				return i;
			}
		}
		return -1;
	}	 	  			     		 		    		 	


	/**	 	  			     		 		    		 	
	 * 
	 * @return true if all points of the polygon are in the same quadrant, false otherwise
	 * 
	 */	 	  			     		 		    		 	
	public boolean inSingleQuadrant() {	 	
		int pointCount = 0;
		
		for(int i = 0; i<points.length-1; i++) {
			if(points[i].getQuadrant() == points[i+1].getQuadrant()) {
				pointCount++;
			}
		}
		
		if(pointCount >= points.length-1) {
				return true;
			}
		
		return false;
		}	 	  			     		 		    		 	

		/**	 	  			     		 		    		 	
		 * 
		 * @param p
		 * @return number of points that are further from the origin than point p is. 
		 */	 	  			     		 		    		 	
		public int countPointsFurtherThan(Point p) {
			int count = 0;
			
			for(int i = 0; i<points.length; i++) {
				double thisDistance = distance(0,0,this.points[i].x, this.points[i].y);
				double pDistance = distance(0,0,p.x, p.y);
				if(thisDistance > pDistance) {
					count++;
				}
			}
			return count;
		}	 	  			     		 		    		 	

		/**	 	  			     		 		    		 	
		 * @return a 2-dimensional array containing points.length subarrays,
		 * each containing two items.
		 * first subarray contains points[0].x, points[0].y
		 * second subarray contains points[1].x, points[1].y
		 * and so on
		 */	 	  			     		 		    		 	
		public int[][] get2DArray() {	 	  			     		 		    		 	
			int length = points.length;
			int[][] arr = new int [length][2]; //number of sub arrays is equal to points.length and each sub array has 2 indexes for x and y
			
			//for a 2d array a nested loop is used in order to populate the sub arrays with the corresponding x and y values
			for(int i = 0; i<arr.length; i++) {
				for(int y = 0; y<arr[i].length; y++) {
					arr[i][0] = points[i].x;
					arr[i][1] = points[i].y;
				}
			}
			return arr;
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