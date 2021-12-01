package main;

public class MovieQuoteInfo {

	public int x = 0;
	
	public static void sleepFunc(int x){
		try {
			Thread.sleep(x);
		}
		catch (Exception e){
			System.out.println(' ');
		}
	}
	public static void main(String[] args) {
		
		
		System.out.println("'Every champion was once a contender that refused to give up'");
		sleepFunc(3000);
		System.out.println("-Rocky Balboa");
		sleepFunc(2000);
		System.out.println("*Rocky Movie (1976)*");
		sleepFunc(10000);
		
		
	}

}
