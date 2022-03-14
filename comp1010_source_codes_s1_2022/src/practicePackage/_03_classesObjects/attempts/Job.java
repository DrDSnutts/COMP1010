package practicePackage._03_classesObjects.attempts;

public class Job {
	public double hourlyRate, numberOfHours;

	//final because it's value shouldn't change
	//static because only one copy needed irrespective of number of objects
	public final static double MIN_HOURLY_RATE = 21.45;

	//DEFAULT CONSTRUCTOR
	public Job() {
		//DO NOT MODIFY - assigns default value (0) to both instance variables
	}
	
	/**
	 * Parameterized Constructor: assigns parameters to corresponding instance variables
	 * @param h: value intended for hourlyRate
	 * @param n: value intended for numberOfHours
	 * 
	 * assign the higher of h and MIN_HOURLY_RATE into the instance variable hourlyRate.
	 * assign the higher of n and 1 into the instance variable numberOfHours.
	 */
	public Job(double h, double n) {
		if(h > MIN_HOURLY_RATE) {
			hourlyRate = h;
		}
		else {
			hourlyRate = MIN_HOURLY_RATE;
		}
		if(n > 1) {
			numberOfHours = n;
		}
		else {
			numberOfHours = 1;
		}
		
	}
	
	/**
	 * 
	 * @return the total salary offered by this job.
	 * example,
	 * if hourlyRate = 24.5
	 * and numberOfHours = 7.5
	 * return 183.75
	 */
	public double getSalary() {
		return hourlyRate*numberOfHours;
	}

	/**
	 * 
	 * @param other
	 * @return 
	 * 1 if calling object has a higher salary than parameter object
	 * -1 if calling object has a lower salary than parameter object
	 * 0 if calling object has the same salary than parameter object
	 */
	public int compareTo(Job other) {
		if(this.hourlyRate*this.numberOfHours > other.hourlyRate*other.numberOfHours) {
			return 1;
		}
		if(this.hourlyRate*this.numberOfHours < other.hourlyRate*other.numberOfHours) {
			return -1;
		}
		return 0;
	}
}
