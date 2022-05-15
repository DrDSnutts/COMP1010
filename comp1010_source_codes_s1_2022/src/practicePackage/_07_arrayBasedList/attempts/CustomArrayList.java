package practicePackage._07_arrayBasedList.attempts;

/**
 * CustomArrayList provides a (very basic) implementation of an ArrayList
 * containing a collection of int values.
 * we add the CORE methods:
 * 
 * isEmpty() return true if list is empty
 * size() number of items in list
 * add(int) add given item
 * add(int, int) add at given index the given value
 * remove(int) remove given item
 * remove(int) remove item from given index
 * 
 * auxillary methods
 * 
 * indexOf(int) first index where item is found
 * lastIndexOf(int) last index where item is found
 * 
 * It is not "generic"/"parameterized" #REMIND_ME_COMP229
 * @author gauravgupta
 * 
 */
public class CustomArrayList {
	//instance variables
	public int[] data; //data.length gives the capacity
	public int nItems; //nItems gives items currently in the arraylist

	//DO NOT MODIFY
	public CustomArrayList() {
		nItems = 0;
		data = new int[10];
	}

	//DO NOT MODIFY
	public boolean isEmpty() {
		return nItems == 0;
	}

	//DO NOT MODIFY
	public int currentSize() {
		return nItems;
	}


	//DO NOT MODIFY
	public int currentCapacity() {
		return data.length;
	}

	//DO NOT MODIFY
	public boolean isFull() {
		return nItems == data.length;
	}


	//DO NOT MODIFY
	public String toString() {
		String result = "[";
		for(int i=0; i < nItems; i++) {
			result = result +  data[i] +", ";
		}
		if(result.length() > 1) //not empty
			result = result.substring(0, result.length()-2);
		return result + "]";
	}

	/**
	 * grow the array by 5 items
	 */
	public void grow() {
		int[] temp = new int [data.length+5];
		
		for(int i = 0; i<data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	/**
	 * grow the array by n items. do nothing if n is less than or equal to 0
	 * @param n
	 */
	public void grow(int n) {
		if(n <= 0) {
			return;
		}
		
		int[] temp = new int [data.length+n];
		
		for(int i = 0; i<data.length; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	/**
	 * add the value to the end of list.
	 * grow the list if required
	 * @param value
	 */
	public void add(int value) {
		if(isFull()) {
			grow(1);
		}
		
		data[nItems] = value;
		nItems++;
	}

	/**
	 * 
	 * @param idx
	 * @return item at index idx if there, null otherwise
	 */
	public Integer get(int idx) {	
		if(idx >= nItems || data == null || idx<0 || nItems == 0) {
			return null;
		}
		
		int item = data[idx];
		return item;
	}

	/**
	 * set the item at index idx to value newValue,
	 * returning the value previously stored at index idx
	 * @param idx
	 * @param newValue
	 * @return the value that was overwritten
	 * 
	 * return null if the index is invalid
	 */
	public Integer set(int idx, int newValue) {
		if(idx >= nItems || idx<0) {
			return null;
		}
		
		int temp = data[idx];
		data[idx] = newValue;
		return temp;
	}

	/**
	 * 
	 * @param oldValue
	 * @param newValue
	 * @return the index at which oldValue first existed 
	 * and is replaced, -1 otherwise
	 */
	public int replace(int oldValue, int newValue) {
		if(data == null|| nItems == 0) {
			return -1;
		}
		
		for(int i = 0; i<nItems; i++) { 
			if(data[i] == oldValue) {
				data[i] = newValue;
				return i;
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param oldValue
	 * @param newValue
	 * @return a CustomArrayList object containing all indices 
	 * where oldValue occurred and is now replaced by newValue
	 */
	public CustomArrayList replaceAll(int oldValue, int newValue) {
		if(data == null|| nItems == 0) {
			return null;
		}
		
		CustomArrayList arr = new CustomArrayList();
		
		for(int i = 0; i<nItems; i++) {
			if(data[i] == oldValue)
			arr.add(i);
		}
		
		int count = 0;
		for(int i = 0; i<nItems; i++) { 
			if(data[i] == oldValue) {
				data[i] = newValue;
			}
			else {
				count++;
			}
		}
		if(count >= nItems) {
			return arr;
		}
		
		return arr;
	}

	/**
	 * add item value at index idx
	 * @param idx
	 * @param value
	 * @return true if value CAN be added at index idx,
	 * false otherwise (if idx is invalid).
	 * FOR EXAMPLE, 
	 * If a list contains 5 items, we can add a new value
	 * at any index from 0 (before the first item) to
	 * 5 (after the last item)
	 */ 
	public boolean add(int idx, int value) {
		if(idx > nItems || idx < 0) {
			return false;
		}
		
		CustomArrayList temp = new CustomArrayList();
		
		nItems = nItems + 1;
		
		temp.data[idx] = value;
		int j = 0;
		
		for(int i = 0; i<nItems; i++) {
			if(i != idx) {
				temp.data[i] = data[j];
				j++;
			}
		}
		
		for(int k = 0; k<nItems; k++){
			data[k] = temp.data[k];
		}
		return true;
	}

	/**
	 * remove the value at index idx (if any) and return value removed.
	 * if idx is invalid, return null
	 * @param idx
	 * @return the value removed
	 * FOR EXAMPLE, 
	 * If a list contains 5 items, we can remove a value
	 * at any index from 0 (first item) to
	 * 4 (last item)	
	 */
	public Integer remove(int idx) {
		if(idx >= nItems || idx < 0) {
			return null;
		}
		
		CustomArrayList temp = new CustomArrayList();
		temp.nItems = this.nItems - 1;
		int remove = data[idx];
		
		int k = 0;
		
		for(int i = 0; i<nItems; i++) {
			if(data[i] != remove) {
				temp.data[k] = data[i];
				k++;
			}
		}
		this.nItems = this.nItems - 1;
		
		for(int j = 0; j<nItems; j++) {
			data[j] = temp.data[j];
		}
		return remove;
		}

	/**
	 * 
	 * @param other
	 * @return true if calling object and parameter objects
	 * have the same items in the same order
	 * 
	 * FOR EXAMPLE,
	 * 
	 * if 
	 * instance variable data of calling object = [10,70,20,90]
	 * instance variable data of parameter object = [10,70,20,90]
	 * return true	
	 *  
	 * if 
	 * instance variable data of calling object = [10,70,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * 
	 * if 
	 * instance variable data of calling object = [10,60,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * 
	 * if 
	 * instance variable data of calling object = [10,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * if 
	 * instance variable data of calling object = [10,20,90]
	 * instance variable data of parameter object = [10,20]
	 * return false
	 */
	public boolean identical(CustomArrayList other) {
		
		if(this.isEmpty() == true && other.isEmpty() == true) {
			return true;
		}
		
		if(this.nItems == 0) {
			return false;
		}
		
		int count = 0;
		for(int i = 0; i<nItems; i++) {
			if(this.data[i] == other.data[i]) {
				count++;
			}
		}
		if(count >= nItems) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param other
	 * @return CustomArrayList object containing all
	 * items of calling object followed by all items
	 * of parameter object
	 * FOR EXAMPLE:
	 * If thisdata = [10,70,20]
	 * otherdata = [50,90]
	 * 
	 * The data instance variable of list returned should
	 * be [10,70,20,50,90]
	 */
	public CustomArrayList join(CustomArrayList other) {
		CustomArrayList arr = new CustomArrayList();
		
		arr.nItems = this.nItems + other.nItems;
		if(arr.nItems > 10) {
			arr.grow(arr.nItems-10);
		}
		
		for(int i = 0; i<this.nItems; i++) {
			arr.data[i] = this.data[i];
		}
		int k = 0;
		for(int j = this.nItems; j<arr.nItems; j++) {
			arr.data[j] = other.data[k];
			k++;
		}
		return arr;
	}

	/**
	 * 
	 * @param idx1
	 * @param idx2
	 * @return CustomArrayList containing items from index
	 * idx1 to index idx2 (inclusive on both sides), if valid.
	 * return null if the range is invalid.
	 * FOR EXAMPLE:
	 * If 
	 * thisdata = [10,70,20,50,90,30,80]
	 * idx1 = 2
	 * idx2 = 5
	 * 
	 * The data instance variable of list returned should
	 * be [20,50,90,30]
	 */
	public CustomArrayList subList(int idx1, int idx2) {
		return null; //to be completed
	}

	/**
	 * 
	 * @param other
	 * @return true if calling object and parameter objects
	 * have the same items (ok to be in different order)
	 * 
	 * FOR EXAMPLE,
	 * 
	 * if 
	 * instance variable data of calling object = [10,70,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return true
	 * 
	 * if 
	 * instance variable data of calling object = [10,60,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * 
	 * if 
	 * instance variable data of calling object = [10,20,90]
	 * instance variable data of parameter object = [90,10,20,70]
	 * return false
	 * if 
	 * instance variable data of calling object = [10,20,90]
	 * instance variable data of parameter object = [10,20]
	 * return false
	 */
	public boolean same(CustomArrayList other) {
		if(this.nItems != other.nItems) {
			return false;
		}
		
		int counter = 0;
		for(int i = 0; i<nItems; i++) {
			
			for(int j = 0; j<nItems; j++) {
				if(this.data[i] == other.data[j]) {
					counter++;
				}
			}
		}
		
		if(counter >= nItems) {
			return true;
		}
		return false;
		
	}

	//sort in ascending order
	public void sort() {
		if(nItems == 0 || data == null) {
			return;
		}
		
		for(int i = 0; i<nItems; i++) {
			int minIndex = i;
			
			for(int k = i+1; k<nItems; k++) {
				if(data[k] < data[minIndex]) {
					minIndex = k;
				}
			}
			int temp = data[i];
			data[i] = data[minIndex];
			data[minIndex] = temp;
		}
	}
}
