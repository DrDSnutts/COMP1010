/**
* DO NOT REMOVE THIS COMMENT
* STUDENT ID: 46358757
* STUDENT NAME: Dominic Wright
* []: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
*/
package attempts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//DO NOT MODIFY
public class DataSetReader {
	public int[] sizes;

	/**	 	  			     		 		    		 	
	 * DO NOT MODIFY This function reads the data from the file supplied and
	 * populates the array: sizes
	 * 
	 * @param filename
	 * @throws IOException
	 */	 	  			     		 		    		 	
	public DataSetReader(String fileName) throws IOException {	 	  			     		 		    		 	
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		int lines = 0;
		String input;
		while ((input = reader.readLine()) != null && !input.isEmpty()) {
			lines++;
		}
		reader.close();

		sizes = new int[lines+1];

		reader = new BufferedReader(new FileReader(fileName));

		for (int i = 1; i <= lines; i++) {
			sizes[i] = Integer.parseInt(reader.readLine());
		}
		reader.close();
	}	 	  			     		 		    		 	
}
