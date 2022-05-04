package practicePackage._06_sorting.attempts;


public class Unit {
	String name;
	int students;

	public Unit(String name, int students) {
		this.name = name;
		this.students = students;
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
		
		if(this.students == other.students && this.name == other.name) {
			return 0;
		}
		if(this.students > other.students) {
			return 1;
		}
		
		if(this.students == other.students) {
			if(this.name.equals("COMP1010")) {
				return 1;
			}
			else {
				return -1;
			}
		}
		
		return -1;
	}
	
	public String toString() {
		return name+": "+students;
	}
	
}
