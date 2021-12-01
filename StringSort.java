package main;

import java.util.*;

public class StringSort {

	public static void main(String[] args) {
			
			//more arrays for value and string
			String[] strings = new String[5];


			//Integer value for loop
			Integer loop = 0;
			
			//Scanner instantiation for user input
		    Scanner input = new Scanner(System.in);
		    
		    //prompt
		    System.out.println("Please enter 5 strings, pressing ENTER after each input.\nThey will be returned in Alphabetical order:\n");
		    
		    //logic for 5 strings only
		    while(loop != 5) {
		    	
		    	//string input
		    	String inp = input.nextLine();
		    	
	    		//adds input to array
	    	    strings[loop] = inp;

	    	    //increases variable for loop
	    	    loop++;  

		    }
		    
		    //java utilities module for sorting arrays
		    Arrays.sort(strings); 
		    
		    //new line
		    System.out.println();
		    
		    //prints final output in alphabetical order
		    for(int r = 0; r < strings.length; r++) {
    	        System.out.println(strings[r]);
    	        
    	    }
		    
	  }
	
}

