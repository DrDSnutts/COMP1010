package practicePackage._03_classesObjects.attempts;

public class DeliveryTruck {
	public Box[] boxes;

	/**
	 * Supplied
	 * create an instance copy of array parcels into boxes.
	 * also, each item of boxes should be an instance copy of the corresponding item in parcels.
	 * @param parcels
	 */
	public DeliveryTruck(Box[] parcels) {
		boxes = new Box[parcels.length];
		for(int i=0; i < parcels.length; i++) {
			boxes[i] = new Box(parcels[i]);
		}
	}
	
	/**
	 * P
	 * @return number of boxes that are cubes.
	 * Note: it might help you to create a helper method in 
	 * Cube that checks if the calling object is a Cube or not.
	 */
	public int countCubes() {
		return 0;
	}
	
	/**
	 * P
	 * @return total volume of all the boxes
	 */
	public int totalVolume() {
		return 0;
	}
	
	/**
	 * P
	 * @param vol
	 * @return true if the truck contains any box with given volume, false otherwise
	 */
	public boolean contains(int vol) {
		return false;
	}
	
	/**
	 * CR
	 * @param vol
	 * @return a reference copy of the first box that has the given volume.
	 * return null if none of the boxes have the given volume
	 */
	public Box getWithVolume(int vol) {
		return null;
	}
	
	/**
	 * D
	 * @param b
	 * append Box b to the end of the array.
	 * IMPORTANT: the current items should remain unchanged.
	 * so if boxes[0] refers to instance X before adding b,
	 * boxes[0] should refer to the same instance X after adding b,
	 * same for boxes[1], boxes[2] ... boxes[boxes.length-1] (all items before adding b)
	 */
	public void add(Box b) {
	}

	/**
	 * HD
	 * @return the number of boxes that are "identical"
	 * Please refer to Box class about how to check for identical boxes.
	 * 
	 * For example, if you have boxes of:
	 * 1 x 3 x 2, 1 x 2 x 3, 2 x 1 x 3, 10 x 10 x 10, 4 x 4 x 5, 2 x 3 x 1 and 5 x 4 x 4
	 * all four boxes with one of the sides = 1 are identical
	 * and both boxes with one of the sides = 5 are identical
	 * so return 6 (4+2)
	 */
	public int countIdenticalBoxes() {
		return 0;
	}
}
