package helloworld;

public class Main {

	public static void main(String[] args) {
		
		 double itemPrice = 10.00;
		 int moneyInWallet = 20;
		 double numberOfFriends = 100.0;
		 double age = 33.0;
		 double friendsDividedByAge = numberOfFriends/age;
		String firstName = "Veronica";
		String middleInitial = "M";
		String lastName = "Grady";
	 
		System.out.println("Price of item: " + itemPrice);
		System.out.println("Money in my wallet: " + moneyInWallet);	
		System.out.println("My friends: " + numberOfFriends);
		System.out.println("My age: " + age);
		System.out.println("My number of friends divided by age: " + friendsDividedByAge);
		
		System.out.println("Veronica M Grady");
		
		
		
		System.out.println(firstName + " "+ middleInitial+ " " + lastName);
		
		//Price after buying an item
		itemPrice = itemPrice - 1;
		System.out.println(itemPrice);
				

	}

}

