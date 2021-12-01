package main;

import java.util.*;

public class BabyNameComparison {
	public static void main(String[] args) {
		
	//creates boolean in case of some program error for an easy restart
	boolean end = false;
	
	//while loop in case of error to easily restart, otherwise application terminates upon completion
	while (end != true) {
		
		//try catch for error
	    try {

	    	//instantiates scanner for input
	    	Scanner inp = new Scanner(System.in);
	        
	    	//new string array
	        String[] names = new String[3];
	
	        //new input while x < 3
	        System.out.println("Enter three first baby names,\npressing ENTER after each input:");
	        for (int x = 0; x < 3; x++) {
	            names[x] = inp.nextLine();
	        }
	        
	        //final output of every possible concatenate
	        System.out.println("\nEvery possible concatenate of the names:");
	        System.out.println("1: " + names[1] + " " + names[0]);
	        System.out.println("2: " + names[0] + " " + names[1]);
	        System.out.println("3: " + names[1] + " " + names[2]);
	        System.out.println("4: " + names[2] + " " + names[1]);
	        System.out.println("5: " + names[2] + " " + names[0]);
	        System.out.println("6: " + names[0] + " " + names[2]);
	        
	    	
	        //sets boolean to true at end of loop to terminate the program
	        end = true;
	    }
	    catch(Exception howIsThisPossible) {
	    	
	    	//error catch exception
	    	System.out.println("\nAn error has occured, try again.");

	    	
	    }
	  }
	}
  }
