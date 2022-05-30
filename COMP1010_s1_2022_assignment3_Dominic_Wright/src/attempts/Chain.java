/**
* DO NOT REMOVE THIS COMMENT
* STUDENT ID: 46358757
* STUDENT NAME: Dominic Wright
* [x]: add an 'x' inside the square brackets to declare that you haven't seen any other person's code
*/
package attempts;

public class Chain {
	public Block head = null;
	public int rank;
	public int size;
	// Attributes to be added

	/**	 	  			     		 		    		 	
	 * Default constructor
	 * 
	 * You may modify this constructor if you need to (e.g. if you want to
	 * initialise extra attributes in the class)
	 */	 	  			     		 		    		 	
	public Chain() {	 	  			     		 		    		 	
		head = null;
		// Attributes to be added
	}	 	  		
	

	// DO NOT MODIFY
	public String toString() {	 	  			     		 		    		 	
		if (head == null) {
			return null;
		}
		return head.toString();
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @param id - The first number in the chain
	 * @return a valid Collatz chain starting at id and ending at 1. The chain
	 *         shouldn't contain any loops. If the given id is non-positive, return
	 *         null. There are 2 tests for this method, one to check your logic (P)
	 *         and another to check the efficiency of the code (HD).
	 */	 	  			     		 		    		 	
	public Block createChain(int id) {
		
		//if this function is being called rank and size are both at least 1
		rank = 1;
		size = 1;
		
		//base case
		if(id < 1) {
			return null;
		}
		
		return this.head = new Block(id, rank, createChainHelper(id,rank))	;
	
	}	
	
	public Block createChainHelper (int id, int rank) {
		//base cases
		if(id < 1) {
			return null;
		}
		if(id == 1 ) {
			return null;
		}
		
		if(id % 2 == 0) {
			id = id/2;
		}
		else {
			id = id*3+1;
		}
		rank++;
		size++;
	
		//allocates id and rank to current block, calls functions for next block
		return new Block(id,rank, createChainHelper(id,rank));
		
	}

	/**	 	  			     		 		    		 	
	 * 
	 * @return the number of Blocks in the chain. There are 2 tests for this method,
	 *         one to check your logic (P) and another to check the efficiency of
	 *         the code (HD).
	 */	 	  			     		 		    		 	
	public int size() {	 	 
		return this.size;
	}
//		return count(this.head);
//	}	 	
//	
//	public int count(Block block) {
//		if(block == null) {
//			return 0;
//		}
//		size = 1 + count(block.next);
//		return size;
//	}

	/**	 	  			     		 		    		 	
	 * 
	 * @return the Block that contains the highest id in the Chain. If there aren't
	 *         any Blocks in the chain, return null.
	 */	 	  			     		 		    		 	
	public Block maxValue() {	
		if(this.head == null) {
			return null;
		}
		
		int tempMax = this.head.id;
		Block current = this.head;
		Block max = this.head;
		
		while(current != null) {
			if(current.id > tempMax) {
				tempMax = current.id;
				max = current;
			}
			current = current.next;
		}
		return max;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @param id - The first number in the chain
	 * @return a faster Collatz chain with odd number only (3n+1/2 directly, as 3n+1
	 *         is always even). The chain shouldn't contain any loops. If the given
	 *         id is non-positive, return null.
	 */	 	  			     		 		    		 	
	public Chain createFasterChain(int id) {	 	  			     		 		    		 	
		if(id < 1) {
			return null;
		}
		
		return null;

	}	 	
	
	
	/**	 	  			     		 		    		 	
	 * 
	 * @param other
	 * @return the id of the first common block between the two Chains. If there is
	 *         no common block, return null. If the ranks differ, return the one
	 *         with the higher rank.
	 */	 	  			     		 		    		 	
	public Block firstCommonBlock(Chain other) {	 	  			     		 		    		 	
		return null;
	}	 	  			     		 		    		 	
	
	/**	 	  			     		 		    		 	
	 * 
	 * @param id - ID to be removed
	 * @return the removed Block. If there doesn't exist a Block with the given ID,
	 *         return null. If a Block is removed, the rank of all the Blocks after
	 *         it needs to be updated to ensure there isn't a gap in ranking.
	 */	 	  			     		 		    		 	
	public Block removeId(int id) {	 	  			     		 		    		 	
		return null;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @return a Chain where all the Blocks in the current chain is sorted in
	 *         ascending order. Do not modify the calling object.
	 */	 	  			     		 		    		 	
	public Chain Sort() {	 	  			     		 		    		 	
		return null;
	}	 	  			     		 		    		 	

	/**	 	  			     		 		    		 	
	 * 
	 * @param min
	 * @param max
	 * @return the seed (id) in the interval [min, max] that gives the longest
	 *         chain. Only positive seed should be considered. If the interval is
	 *         invalid, return null.
	 */	 	  			     		 		    		 	
	public Chain longestChain(int min, int max) {	 	  			     		 		    		 	
		return null;
	}	 	  			     		 		    		 	

}
