package main;

import java.util.*;

public class AscendingAndDescending {
	public static void main(String[] args) {
		//Scanner instantiation for user input
	    Scanner input = new Scanner(System.in);
	    
	    //User input
	    System.out.println("Please enter three integers, pressing ENTER after each integer:");
	    String int1 = input.nextLine();
	    String int2 = input.nextLine();
	    String int3 = input.nextLine();
	    System.out.println();
	    
	    //Confirms that inputs are integers
	    try{
	      Integer.parseInt(int1);
	      Integer.parseInt(int2);
	      Integer.parseInt(int3);
	    }
	    
	    //Terminates program if conditions are not met
	    catch(Exception e){
	      System.out.print("You did not enter integers, or your numbers are too large for primitive data types, please restart the program and try again.");
	      System.exit(0);
	    }
	    
	    //Assigning integers to separate variable to easily determine values
	    Integer x = Integer.valueOf(int1);
	    Integer y = Integer.valueOf(int2);
	    Integer z = Integer.valueOf(int3);
	    
	    //ASsigning variables to be used in string for orders later
	    Integer upper = null;
	    Integer middle = null;
	    Integer lower = null;
	    
	    /*
	    Spaghetti Warning
	    A bunch of nested if else statements to determine Largest, Middle, and Lower integer
	    (could also be done with AND, but the module included nested if else statements 
	    so I thought I'd try it)
	    */
	    
	    if(x != y && y != z && x != z ) {
		    if(x>y) {
		    	if(y<z) {
		    		if(x>z) {
		    			upper = x;
			    		lower = y;
			    		middle = z;
		    			}
		    		else {
		    			upper = z;
		    			middle = x;
		    			lower = y;
		    		}
		    		}
		    	
		    	if(z<y) {
		    		upper = x;
		    		middle = y;
		    		lower = z;
		    	}
		    }
		   if(y>x) {
			   if(x<z) {
		    		if(y>z) {
		    			upper = y;
			    		lower = x;
			    		middle = z;
		    			}
		    		else {
		    			upper = z;
		    			middle = y;
		    			lower = x;
		    			}
		    		}
		    	
		    	if(z<x) {
		    		upper = y;
		    		middle = x;
		    		lower = z;
		    		}
		    	}
	    	}
	    else {
	    	if(x == y) {
	    		if(x > z) {
	    			lower = z;
	    			middle = x;
	    			upper = y;
	    		}
	    		else {
	    			upper = z;
	    			middle = x;
	    			lower = y;
	    		}
	    	}
	    	if(y == z) {
	    		if(y > x) {
	    			lower = x;
	    			middle = y;
	    			upper = z;
	    		}
	    		else {
	    			upper = x;
	    			middle = y;
	    			lower = z;
	    		}
	    	}
	    	if(x == z){
	    		if(x > y) {
	    			lower = y;
	    			middle = z;
	    			upper = x;
	    		}
	    		else {
	    			upper = y;
	    			middle = x;
	    			lower = z;
	    		}
	    	}
	    	
	    }
	    
	    
	    //Now finally, the two required output strings combining the three values
	    System.out.println("Your integers in Descending order: " + upper + ", " + middle + ", and " + lower);
	    System.out.println("Your integers in Ascending order: " + lower + ", " + middle + ", and " + upper);
	}
}
