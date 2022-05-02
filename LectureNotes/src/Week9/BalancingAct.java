package Week9;

public class BalancingAct {

	public static void main(String[] args) {
		
		String s = "()";
		
		System.out.println("is " + s + " balanced: " +isBalanced(s));

	}

	/**
	 * 
	 * @param brackets
	 * @return boolean - whether balanced or not
	 */
	private static boolean isBalanced(String brackets) {
		
		MyStack stk = new MyStack();
		String opening = "({[";
		String closing = "]})";
		
		for (int i = 0; i<brackets.length(); i++) {
			char cur = brackets.charAt(i); 
			
			if(opening.indexOf(cur) >= 0) {
				stk.push(cur + "");
			}
			else if(closing.indexOf(cur) >= 0) {
				if(stk.isEmpty()) {
					return false;
				}
				String popped = stk.pop();
				if(opening.indexOf(popped) != closing.indexOf(cur)) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return stk.isEmpty();
	}

}
