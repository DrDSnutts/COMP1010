/**
 * DO NOT REMOVE THIS COMMENT
 * STUDENT ID: 46358757
 * STUDENT NAME: Dominic Wright
 * [x]: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
 */
package attempt;

import java.io.IOException;

public class IceCreamPrices {
	public String[][] iceCreamDetails; // Company, name, Type
	public double[][] sizeAndPrices; // Size, Price

	public IceCreamPrices(String filename) throws IOException {	 	  			     		 		    		 	
		DatasetReader reader = new DatasetReader(filename);
		iceCreamDetails = reader.iceCreamDetails;
		sizeAndPrices = reader.sizeAndPrices;
	}	 	  	    		 		    		 	

	/**	 	  			     		 		    		 	
	 * YOUR JOB BEGINS BELOW THIS COMMENT 
	 */	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * P/CR
	 * 
	 * @param idx
	 * @return true if idx is a valid index in the arrays, false otherwise. A index
	 *         is valid if there is an item at that index. Assume that the two
	 *         arrays are of the same length.
	 *         
	 *         Remember these are two-dimensional arrays. Read the specifications carefully and 
	 *         understand what they store and what is being asked.
	 *         
	 *         For example, if there are 20 different ice creams, there will be 20 arrays
	 *         in iceCreamName, each containing 3 Strings, and there will be 20 arrays
	 *         in sizeAndPrices, each containing 2 numerical values.
	 */	 	  			     		 		    		 	
	public boolean validIndex(int idx) {	
		if (idx < iceCreamDetails.length && idx >= 0)
			return true;
		return false;

		//another test another test
	}

	/**	 	  			     		 		    		 	
	 * P/CR
	 * 
	 * @return the total cost if you would buy one of every ice cream.
	 */	 	  			     		 		    		 	
	public double totalCost() {	 	
		double sum = 0;
		for(int i = 0; i<=sizeAndPrices.length-1; i++) {
			sum += sizeAndPrices[i][1];
		}
		return sum;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * P/CR
	 * 
	 * @param size
	 * @return the average cost of a ice cream with the given size.
	 */	 	  			     		 		    		 	
	public double averageCostSize(int size) {	 
		double sum = 0;
		double count = 0;
		for(int i = 0; i<=sizeAndPrices.length-1; i++) {
			for(int j = 0; j<=sizeAndPrices[i].length-1; j++) {
				if(sizeAndPrices[i][0] == size) {
					count++;
					sum += sizeAndPrices[i][1];
				}
			}
		}
		return sum/count;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * P/CR
	 * 
	 * @param target
	 * @return index within which the target exists, -1 if it doesn't exist. The target
	 *         can be either represent a Company, Ice Cream Name or Type. Return the index of the first
	 *         occurrence if there is more than 1.
	 */	 	  			     		 		    		 	
	public int getIndex(String target) {	
		for(int i = 0; i<=iceCreamDetails.length-1; i++) {
			for(int j = 0; j<=iceCreamDetails[i].length-1; j++) {
				if(iceCreamDetails[i][j].equalsIgnoreCase(target)) {
					return i;
				}
			}
		}
		return -1;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * P/CR
	 * 
	 * It can be of interest to know how many versions of ice creams a certain company has or
	 * how many different versions of a certain ice cream exist. Given an input,
	 * return the number of exact occurrences exists. Use
	 * String1.equalsIgnoreCase(String2) to not worry about the case.
	 * 
	 * Sample usage:
	 * 
	 * String a = "Hello";
	 * String b = "hELLo";
	 * String c = "Hello!";
	 * boolean x = a.equalsIgnoreCase(b); //x is true
	 * boolean x = a.equalsIgnoreCase(c); //y is false
	 * 
	 * For example if the input is "hAagen-dazs", it should match "Haagen-Dazs" (case-insensitive) but
	 * not "Haagen-Dazs Special"
	 * 
	 * IMPORTANT: Don't double count if more than one value from iceCreamDetails sub-array match target
	 * 
	 * @param target
	 * @return the number of exact occurrences of target.
	 */	 	  			     		 		    		 	
	public int countOccurances(String target) {
		int count = 0;
		int minus = 0;
		for(int i = 0; i<iceCreamDetails.length; i++) {		
			if(iceCreamDetails[i][2].equalsIgnoreCase(target) && iceCreamDetails[i][0].equalsIgnoreCase(target)) {
				minus++;
			}			
			for(int j = 0; j<iceCreamDetails[i].length; j++) {
				if(iceCreamDetails[i][j].equalsIgnoreCase(target)) {
					count++;
				}
			}		
		}
		return count-minus;
	}	
	/**	 	  			     		 		    		 	
	 * P/CR
	 * 
	 * @param company
	 * @return the average cost of ice creams for the given company. If the
	 *         company doesn't exist, return -1.
	 */	 	  			     		 		    		 	
	public double averageCostCompany(String company) {	
		double cost = 0;
		double count = 0;

		for(int i = 0; i<iceCreamDetails.length; i++) {
			if(iceCreamDetails[i][0].equalsIgnoreCase(company) && iceCreamDetails[i][2] != "Smoothies") {
				cost += sizeAndPrices[i][1];
				count++;
			}
		}
		double average = cost/count;
		if (average>=0) {
			return average;
		}
		return -1;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * P/CR
	 * 
	 * The following keywords should be used for sizes: 
	 * 1 - "Kids" 
	 * 2 - "Small"
	 * 3 - "Normal"
	 * 4 - "Jumbo"
	 * 
	 * @param idx
	 * @return the ice cream as a string in the format:
	 * 
	 * 						Company, Name, type - size, $Price 
	 * 
	 * If the index is invalid, return null. 
	 * 
	 * IMPORTANT!!! If you don't understand the description, see test cases for further detail.
	 */	 	  			     		 		    		 	
	public String toString(int idx) {	
		//invalid therefore return null
		if (idx > iceCreamDetails.length-1 || idx < 0)
			return null;

		if(sizeAndPrices[idx][0] == 1) {
			return iceCreamDetails[idx][0] +", "+ iceCreamDetails[idx][1] +", "+ iceCreamDetails[idx][2] + " - " +
					"Kids" +" $"+ sizeAndPrices[idx][1];
		}

		if(sizeAndPrices[idx][0] == 2) {
			return iceCreamDetails[idx][0] +", "+ iceCreamDetails[idx][1] +", "+ iceCreamDetails[idx][2] + " - " +
					"Small" +" $"+ sizeAndPrices[idx][1];
		}

		if(sizeAndPrices[idx][0] == 3) {
			return iceCreamDetails[idx][0] +", "+ iceCreamDetails[idx][1] +", "+ iceCreamDetails[idx][2] + " - " +
					"Normal" +" $"+ sizeAndPrices[idx][1];
		}

		if(sizeAndPrices[idx][0] == 4) {
			return iceCreamDetails[idx][0] +", "+ iceCreamDetails[idx][1] +", "+ iceCreamDetails[idx][2] + " - " +
					"Jumbo" +" $"+ sizeAndPrices[idx][1];
		}

		return " ";


	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * P/CR
	 * 
	 * @param minSize
	 * @param type
	 * @return the minimum cost of a ice cream that has a size of at least minSize and
	 *         is of the correct type.
	 *         
	 * return -1 if size is not between 1 and 4 (inclusive on both sides)
	 */	 	  			     		 		    		 	
	public double minCost(int minSize, String type) {	
		if(minSize <= 0 || minSize > 4) {
			return -1;
		}
		double min = sizeAndPrices[0][1];

		for(int i = 0; i<sizeAndPrices.length; i++) {	
			if (sizeAndPrices[i][0] >= minSize && iceCreamDetails[i][2].equalsIgnoreCase(type)) {
				min = sizeAndPrices[i][1];

			}
		}

		for(int i = 0; i<sizeAndPrices.length; i++) {	
			if (sizeAndPrices[i][0] >= minSize && iceCreamDetails[i][2].equalsIgnoreCase(type)) {
				if(sizeAndPrices[i][1] < min) {
					min = sizeAndPrices[i][1];
				}
			}
		}
		return min;
	}	 	
	//what



	/**	 	  			     		 		    		 	
	 * D
	 * 
	 * @return an array containing all the unique company names in the dataset. The
	 *         name that occurs first in the dataset should also occur first in the
	 *         returned array.
	 */	 	  			     		 		    		 	
	public String[] getUniqueCompanies() {
		String[] companies = new String [iceCreamDetails.length];
		
		//put all companies into an array
		for(int i = 0; i<iceCreamDetails.length; i++) {
					companies[i] = iceCreamDetails[i][0];
				}
		int n = 0;
		String[] temp = new String[n];
		
		for(int i = 0; i<companies.length; i++) {
			if(companies[i] != temp[i]) {
				n++;
				temp[i] = companies[i];
			}
		
			if(companies[i] == temp[i]) {
				break;
			}
		}
		return temp;
		
	}

	private static String[] returnEmptyArr() {
		return new String[0];
	}
	
	
	
	
	

	/**	 	  			     		 		    		 	
	 * D/HD
	 * 
	 * @return the company that has the smallest difference in ice cream prices.
	 * 
	 * That is, the smallest difference between the price of the most expensive icecream they sell,
	 * and the price of the least expensive icecream they sell.
	 * 
	 * Choose the first company that occurs in the dataset if there is a tie.
	 */	 	  			     		 		    		 	
	public String minDiffPrice() {	 	  			     		 		    		 	
		return null;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * D/HD
	 * 
	 * @return an array contains the number of unique ice cream names at every
	 *         company. The order of items in the returned arrays should be 
	 *         the same as the order of the first occurrences of the companies.
	 */	 	  			     		 		    		 	
	public int[] uniqueIceCreamsCompany() {	 	  			     		 		    		 	
		return null;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * Bonus, not assessed
	 * 
	 * A group of n people want to order ice creams. Since they are ordering them,
	 * they don't care if the ice creams are coming from different companies. But
	 * they all want their ice creams to be of the same size.
	 * 
	 * @param n
	 * @param size
	 * @return the max number of combinations they can order of the same size 
	 * if no one orders the exact same ice cream. If this is not possible, return -1.
	 * 
	 * Consider the test: assertEquals(5, data_1.sameSize(4, 4));
	 * There are 5 records for size 4. These differ in name and/or type.
	 * 
	 *  Haagen-Dazs	Birthday Cake	Ice Cream Cakes	4
	 *  Haagen-Dazs	Chocolate Drizzle Cake	Ice Cream Cakes	4
	 *  Haagen-Dazs	Confetti Cake	Ice Cream Cakes	4
	 *  Cow & the Moon	edge, case	Smoothies	4
	 *  Haagen-Dazs	edge, case	Smoothies	4
	 * 
	 *  Call these i1,i2,i3,i4,i5
	 *  
	 *  You can order in many many many ways.
	 *  
	 *  Person 1 orders i1, Person 2 orders i2, Person 3 orders i3, Person 4 orders i4. (represent this as 1234)
	 *  
	 *  Another way
	 *  
	 *  Person 1 orders i5, Person 2 orders i3, Person 3 orders i2, Person 4 orders i1. (represent this as 5321) 
	 *  
	 *  Yet another way:
	 *  
	 *  Person 1 orders i3, Person 2 orders i1, Person 3 orders i4, Person 4 orders i2. (represent this as 3142)
	 *  
	 *  But 3142 is the same as 1234 since the order is identical, and hence should only be counted once.
	 *  
	 * 
	 */	 	  			     		 		    		 	
	public int sameSize(int n, int size) {	 	  			     		 		    		 	
		return -1;
	}	 	  			     		 		    		 	
}
