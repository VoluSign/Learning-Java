package main;

import java.util.*;


public class InchesToFeetInteractive {

	public static void main(String[] args) {
		int div = 12;
		
		Scanner inp = new Scanner(System.in);
	    System.out.println("Enter inches to be converted to feet:");

	    String in = inp.nextLine(); 

	    //fancy check to make sure its type int try catch
	    try {
	    	Integer.parseInt(in);		    
	    }
	    catch (Exception e){
	    	System.out.println("You have entered a character that cannot be classified as an integer, or your number is too large.\nPlease restart the program and try again.");
	    	System.exit(0);
	    }
	    
	    int inc = Integer.parseInt(in);
    	Integer feet = inc / div;
    	Integer inches = inc % div;
	    String Final = feet.toString() + " feet and " + inches.toString() + " inches";
	    
	    System.out.println("Your conversion is:");
	    System.out.print(Final);
	    
	}

}
