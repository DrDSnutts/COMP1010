/**
* DO NOT REMOVE THIS COMMENT
* STUDENT ID: 46358757
* STUDENT NAME: Dominic Wright
* []: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
*/
package attempt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatasetReader {
	public String[][] iceCreamDetails;
	public double[][] sizeAndPrices;
	
	/**	 	  			     		 		    		 	
	 * DO NOT MODIFY This function reads the data from the file supplied and
	 * populates the two arrays: iceCreamDetails, sizeAndPrices
	 * 
	 * @param filename
	 * @throws IOException
	 */	 	  			     		 		    		 	
	public DatasetReader(String fileName) throws IOException {	 	  			     		 		    		 	
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		int lines = 0;
		String input;
		while ((input = reader.readLine()) != null && !input.isEmpty()) {
			lines++;
		}
		reader.close();

		iceCreamDetails = new String[lines - 1][3];
		sizeAndPrices = new double[lines - 1][2];

		reader = new BufferedReader(new FileReader(fileName));
		reader.readLine();

		for (int i = 1; i < lines; i++) {
			String[] tokens = reader.readLine().split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); // Ensures that , inside
																							// quotes are not removed
			for (int k = 0; k < 3; k++) {
				iceCreamDetails[i - 1][k] = tokens[k];
			}
			sizeAndPrices[i - 1][0] = Integer.parseInt(tokens[3]);
			sizeAndPrices[i - 1][1] = Double.parseDouble(tokens[4].substring(1));
		}
		reader.close();
	}	 	  			     		 		    		 	
}
