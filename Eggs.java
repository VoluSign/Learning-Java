package main;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// Charges 3.25 for a dozen
		// .45 cents for individual
		// You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85.
		
		int div = 12;
		
		Scanner inp = new Scanner(System.in);
	    System.out.println("How many eggs would you like to purchase?");

	    String in = inp.nextLine(); 
	    
	    try {
	    	Integer.parseInt(in);		    
	    }
	    catch (Exception e){
	    	System.out.println("You have entered a character that cannot be classified as an amount of eggs, or your number is too large.\nPlease restart the program and try again.");
	    	System.exit(0);
	    }

	    int inc = Integer.parseInt(in);
    	Integer dozen = inc / div;
    	Integer loose = inc % div;
    	Double dozenFinal = dozen*3.25;
    	Double looseFinal = loose*0.45;
    	Double Total = dozenFinal + looseFinal;

    	
    	//Final output
    	String Final = ("You ordered " + inc + " eggs. Thats " + dozen + " dozen at $3.25 per dozen and " + loose + " loose eggs at $0.45 each for a total of $" + Total);
    	System.out.println(Final);
    	System.out.println("Please enter your credit card information below...");
    	
	}

}
