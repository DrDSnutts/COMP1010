package Week4;

public class DiceRollHistory {
	public int[] outcomes;
	public int nDiceRolled;
	
	public DiceRollHistory() {
		outcomes = new int[10];
		nDiceRolled = 0;
	}
	
	public void roll(){
		int val = (int)(Math.random()*6) + 1;
		outcomes[nDiceRolled++] = val;
	
	}
	
	public String toString() {
		String result = "";
		
		for(int i = 0; i<outcomes.length; i++) {
			result +=outcomes[i]+" ";
		}
		return result;
	}

	public double average() {
		if(nDiceRolled == 0) {
			return 0;
		}
		int sum = 0;
		for(int i = 0; i<nDiceRolled; i++) {
			sum+=outcomes[i];
		}
		return ((double)sum)/nDiceRolled;
	}
}
