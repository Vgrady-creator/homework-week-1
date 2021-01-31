package helloworld;

public class Main {

	

	public static void main(String[] args) {
	
	boolean isHotOutside = true;
	boolean isWeekday = true; 
	boolean hasMoneyInPocket = true;
	double costOfMilk = 5.99;
	double moneyInWallet = 50.0;
	short thristLevel = 7;  
	
	boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
	boolean willGoSwimming = isHotOutside && isWeekday;
	boolean isAGoodDay = isHotOutside &&(hasMoneyInPocket && isWeekday);
	boolean willBuyMilk = isHotOutside && thristLevel >= 3 && moneyInWallet > 2*costOfMilk;
	
	
	
	System.out.println(shouldByIcecream);
	System.out.println(willGoSwimming);
	System.out.println(isAGoodDay);
	System.out.println(willBuyMilk);
	
	
	
	
	
	
	
	
	
		

		
		
	
		 
	}

}

