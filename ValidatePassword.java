package main;

import java.util.*;

public class ValidatePassword {
	public static void main(String[] args) {
		
		//boolean variable for loop unless valid
		boolean valid = false;
		
		//instantiates variables for validation
		int upper = 2;
		int lower = 3;
		int num = 1;
		int tempVar = 0;
		
		//for end of code confirmation
		boolean upperValid = false;
		boolean lowerValid = false;
		boolean numValid = false;
		
		//variable for password after process for later use
		String passFinal = "";
		
    	//instantiates scanner for input
    	Scanner inp = new Scanner(System.in);
	    
    	while(valid == false) {
    		
    		//resets variables in case of loop
    		upperValid = false;
    		lowerValid = false;
    		numValid = false;
    		
	    	//Asks user for new password
	    	System.out.println("Requirements:\nTwo upper case letters.\nAt least three lowercase letters.\nAt least one didgit.\n\nPlease enter new password:");
	    	String pass = inp.nextLine();
	    	
	    	//re-enter password for confirmation
	    	System.out.println("\nPlease re-enter your password for confirmation:");
	    	String temp = inp.nextLine();
	    	
	    	//if password re-confirmation is correct
	    	if(temp.equals(pass)) {
	    		//for loops for each requirement
	    		
	    		//checks for upper case
	    		for (int x = 0; x < pass.length(); x++){
	    			char a = pass.charAt(x);  
	    			
	    			//if character is upper make valid
	    			if(Character.isUpperCase(a)){
	    				tempVar += 1;
	    				if(tempVar == upper) {
	    					upperValid = true;
	    				}
	    			}
	    		}
	    		
	    		//reset variable for reuse
	    		tempVar = 0;
	    		
	    		//checks for lower case
	    		for (int y = 0; y < pass.length(); y++){
	    			char b = pass.charAt(y);
	    			
	    			//if character is lower make valid
	    			if(Character.isLowerCase(b)){
	    				tempVar += 1;
	    				if(tempVar == lower) {
	    					lowerValid = true;
	    				}
	    			}
	    		}
	    		
	    		//reset variable for reuse
	    		tempVar = 0;
	    		
	    		//checks for number
	    		for (int z = 0; z < pass.length(); z++){
	    			char c = pass.charAt(z);
	    			
	    			//if character is lower make valid
	    			if(Character.isDigit(c)){
	    				tempVar += 1;
	    				if(tempVar == num) {
	    					numValid = true;
	    				}
	    			}
	    		}
	    		
	    		//reset, just in case
	    		tempVar = 0;
	    		
	    		//if statement to check validation
	    		if(numValid == false || upperValid == false || lowerValid == false) {
	    			
	    			//number requirement not met output
	    			if(numValid == false) {
	    				System.out.println("You didn't meet the requirment\nfor the ammount of numbers in your password.");
	    			}
	    			
	    			//upper-case requirement not met output
	    			if(upperValid == false) {
	    				System.out.println("You didn't meet the requirment\nfor the ammount of upper case letters in your password.");
	    			}
	    			
	    			//lower-case requirement not met output
	    			if(lowerValid == false) {
	    				System.out.println("You didn't meet the requirment\nfor the ammount of lower case letters in your password.");
	    			}
	    			System.out.println("\nPlease Try again...\n\n\n\n\n\n");
	    		}
	    		
	    		//final output for correct confirmation
	    		if(numValid == true && upperValid == true && lowerValid == true) {
	    			System.out.println("\nConfirmed: Your new password has been set.");
	    			passFinal = pass;
	    			valid = true;
	    		}
	    	}
	    	
	    	//otherwise print error and loop
	    	else {
	    		System.out.println("\nYour passwords do not match, please try again.\n\n\n\n\n\n\n");
	    	}
    	}
    	
	    	
	       
	  
	}
  }