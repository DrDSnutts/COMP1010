package practicePackage._06_sorting.attempts;


public class Unit {
	String name;
	int students;

	public Unit(String name, int students) {
		//to be completed
	}

	/**
	 * 
	 * @param other
	 * @return 1 if calling object is "more than" parameter object
	 * -1 if calling object is "less than" parameter object
	 * 0 if calling object is "equal to" parameter object
	 * comparison criteria: members -> name 
	 *
	 */
	public int compareTo(Unit other) {
		return -1; //to be completed
	}
	
	public String toString() {
		return name+": "+students;
	}
	
}
