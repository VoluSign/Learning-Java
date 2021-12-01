package main;

public class SongLyrics {

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
		
		
		System.out.println("I am smellin' like the rose, that some body gave me on my birthday deathbed.");
		sleepFunc(2000);
		System.out.println("I am smellin' like the rose That somebody gave me 'cause I'm dead & bloated.");
		sleepFunc(2000);
		System.out.println("*rock rift ensues*");
		sleepFunc(1000);
		System.out.println("Yeah, and she says it's natural");
		sleepFunc(1500);
		System.out.print("I feel I've come of age, when she peeks I start to run");
		sleepFunc(10000);
		
		
	}

}
