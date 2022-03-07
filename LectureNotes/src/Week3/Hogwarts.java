package Week3;

public class Hogwarts {

	public static void main(String[] args) {
		Person protagonist = null;
		protagonist = new Person();
		
		protagonist.name = "Harry";
		protagonist.gender = 0;
		protagonist.day = 31;
		protagonist.month = 7;
		protagonist.year = 1980;
		
		System.out.println(protagonist.name);
		System.out.println(protagonist.gender);
		System.out.println(protagonist.day);
		System.out.println(protagonist.month);
		System.out.println(protagonist.year);
		
		Person goof;
		goof = new Person();
		
		goof.name = "Ron";
		goof.gender = 0;
		goof.day = 1;
		goof.month = 3;
		goof.year = 1980;
		//refernce copy
		Person goofsBestFriend = protagonist;
		
		goofsBestFriend = new Person();
		
		goofsBestFriend.name = "Hermione";
		goofsBestFriend.gender = 1;
		goofsBestFriend.day = 19;
		goofsBestFriend.month = 9;
		goofsBestFriend.year = 1979;
	}

}
