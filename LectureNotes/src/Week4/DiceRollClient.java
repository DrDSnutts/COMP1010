package Week4;

public class DiceRollClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiceRollHistory log = new DiceRollHistory();
		System.out.println(log);
		log.roll();
		System.out.println(log);
		log.roll();
		System.out.println(log);
		log.roll();
		System.out.println(log);
		log.roll();
		System.out.println(log);
		
		double avg = log.average();
		System.out.println(avg);
	}

}
