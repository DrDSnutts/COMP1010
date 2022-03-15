package practicePackage._03_classesObjects.attempts;

public class CoffeeTracker {
	public int[] coffeesPerDay;

	/**
	 * create an instance copy of data into coffeesPerDay. The two
	 * objects, data and coffeesPerDay, should have the same values but
	 * NOT refer to the same instance.
	 * @param data (you may assume data.length > 0)
	 */
	public CoffeeTracker(int[] data) {
		 this.coffeesPerDay = new int[data.length];	
			for(int i = 0; i<data.length; i++) {
				coffeesPerDay[i] = data[i];
		}
	}

	public int coffeesConsumed() {
		int sum = 0;
		for(int i = 0; i<coffeesPerDay.length; i++) {
			sum+=coffeesPerDay[i];
		}
		return sum;
	}

	public double averageCoffeesConsumed() {
		double coffees = coffeesConsumed();
		double days = coffeesPerDay.length;
		
		return coffees/days;
		
	}

	public int coffeeFreeDays() {
		int count = 0;
		for(int i = 0; i<coffeesPerDay.length; i++) {
			if(coffeesPerDay[i] == 0) {
				count++;
			}
		}
		return count;
	}
}
