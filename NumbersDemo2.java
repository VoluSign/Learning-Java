package main;

import java.util.Scanner;

public class NumbersDemo2 {

	public static void main(String[] args) {
		double num1 = 6;
		double num2 = 14;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Input a number to be the first variable:\n");
		String in1 = inp.nextLine();
		System.out.print("\nInput a number to be the second variable:\n");
		String in2 = inp.nextLine();
		
		try {
	    	num1 = Double.parseDouble(in1);		
	    	num2 = Double.parseDouble(in2);	
	    }
	    catch (Exception e){
	    	System.out.println("\nYou have entered a character that cannot be classified as an integer, or your number is too large.\nPlease restart the program and try again.");
	    	System.exit(0);
	    }
		
		
		//ordered system of initialization
		System.out.println("\nThere are two variables labeled num1 and num2 respectiveley.\nThe following output is a list of methods in conjunction with these variables.\n\n");
		sleepFunc(10);
		System.out.println("\n");
		
		displayTwiceTheNumber(num1, num2);
		sleepFunc(10);
		System.out.println("\n");
		
		displayNumberPlusFive(num1, num2);
		sleepFunc(10);
		System.out.println("\n");
		
		displayNumberSquared(num1, num2);
		sleepFunc(10);
		System.out.println("\n");
	}
	
	//sleep function
	public static void sleepFunc(int x){
		try {
			Thread.sleep(x*1000);
		}
		catch (Exception e){
			System.out.println(' ');
		}
	}
	
	//first required method
	public static void displayTwiceTheNumber(double num1, double num2) {
		
		double num1x2 = num1 * 2;
		double num2x2 = num2 * 2;
		
		System.out.println("This method prints twice the amount of each individual variable separately..");
		System.out.println("Twice the number of varaiable 1: "+ num1 + " is " + num1x2);
		System.out.println("Twice the number of varaiable 2: "+ num2 + " is " + num2x2);
		
	}
	
	//second required method
	public static void displayNumberPlusFive(double num1, double num2) {
		
		double num1add5 = num1 + 5;
		double num2add5 = num2 + 5;
		
		System.out.println("This method prints each variable seperately plus an amount of 5..");
		System.out.println("The number of varaiable 1: "+ num1 + " with an addition of 5 is " + num1add5);
		System.out.println("The number of varaiable 2: "+ num2 + " with an addition of 5 is " + num2add5);
		
	}
	
	//third required method
	public static void displayNumberSquared(double num1, double num2) {
		
		double num1sqr = num1 * num1;
		double num2sqr = num2 * num2;
		
		System.out.println("This method prints each variable seperately squared..");
		System.out.println("The square of varaiable 1: "+ num1 + " is " + num1sqr);
		System.out.println("The square of varaiable 2: "+ num2 + " is " + num2sqr);
	}
}
