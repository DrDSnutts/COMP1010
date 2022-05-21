/**
* DO NOT REMOVE THIS COMMENT
* STUDENT ID: 46358757
* STUDENT NAME: Dominic Wright
* []: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
*/
package attempts;


public class Block {
	public int id; // Number
	public int rank; // position in the Chain
	public Block next;
	

	// attributes to be added
	public int size;
	public Block head;
	
	public Block(int id, int rank) {	 	  			     		 		    		 	
		this.id = id;
		this.rank = rank;
		this.next = null;
		
		// attributes to be added
	}	 	  			     		 		    		 	
	
	public Block(int id, int rank, Block next) {	 	  			     		 		    		 	
		this.id = id;
		this.rank = rank;
		this.next = next;
		
		// attributes to be added
	}	 	 
	
	
	// Additional constructors may be added

	public Block getHead() {
		return head;
	}
	
	public void sethead(Block head) {
		this.head = head;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	
	public void append(int id, int rank) {
		if(head == null) {
			head = new Block(id, rank);
			return;
		}
		Block current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Block(id, rank);
	}

	// DO NOT MODIFY
	public String toString() {	 	  			     		 		    		 	
		String str = "(" + id + ", " + rank + ")";
		if (this.next == null) {
			return str;
		}
		return str + " -> " + next.toString();
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return the number of Blocks in the Chain that has an even ID.
	 */	 	  			     		 		    		 	
	public int numberEvenBlocks() {	 	  			     		 		    		 	
		Block current = head;
		int evenCount = 0;
		
		while(current != null) {
			if(current.id % 2 == 0) {
				evenCount++;
			}
			current = current.next;
		}
		return evenCount;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return the number of Blocks in the Chain that has an odd ID.
	 */	 	  			     		 		    		 	
	public int numberOddBlocks() {	 	  			     		 		    		 	
		return -1;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return true if the chain starting at the current node is a valid Collatz
	 *         chain and false otherwise. For a chain to be valid, it needs to
	 *         follow the 3n+1 rule but not necessarily have a valid rank. The fast
	 *         collatz chain should be treated as invalid.
	 */	 	  			     		 		    		 	
	public boolean isValid() {	 	  			     		 		    		 	
		return false;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * IMPORTANT: Even thought this method is in the Block class, it may be harder
	 * than most in the Chain class.
	 * 
	 * @return true if the chain starting at the current node is either a valid
	 *         Collatz chain or a fast Collatz chain. In this question, you also
	 *         need to ensure that the rank is valid. A valid rank starts at 1 and
	 *         increases with one.
	 */	 	  			     		 		    		 	
	public boolean isValidAdvanced() {	 	  			     		 		    		 	
		return false;
	}	 	  			     		 		    		 	
}
