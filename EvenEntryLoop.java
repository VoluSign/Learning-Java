package main;

import java.util.*;

public class EvenEntryLoop {
	//Function to clear the workspace to keep it uncluttered
	public static void clear(){
		int i = 0; 
		while (i < 50) {
		      i++; 
		     System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		
		//String variables for final output string
		String even = "even";
		String error = "error";
		String finalOutcome = "";
				
		//while statement to continuosly run program unless conditions are met
		while(true) {
			
			//Clears workspace after user input at end of loop
			clear();
			
			//Scanner instantiation for user input
		    Scanner input = new Scanner(System.in);
		    
		    //User input
		    System.out.println("Please enter an even integer.\nThe program will determine if you input the correct number.\nPress ENTER after typing your value to input it into the system.\nType '999' (The sentinel value) to terminate the program:\n");
		    String integer = input.nextLine();
		    System.out.println();
		    
		    //Confirms that inputs are integers
		    try{
		      Integer.parseInt(integer);
		    }
		    
		    //Terminates program if conditions are not met
		    catch(Exception e){
		      System.out.print("You did not enter an integer, or your numbers are too large for primitive data types, please restart the program and try again.");
		      break;
		    }
		    
		    //Assigning integer to variable to easily determine value
		    Integer x = Integer.valueOf(integer);

		    //Gets remainder value when divided by two so that the symmetry relation can be determined
		    Integer evenodd = x % 2;
		    
		    
		    //if else statement determining remainder value of aforementioned function (if var = 0: outcome is even; if var = 1: outcome is odd)
		    if(evenodd != 0) {
		    	finalOutcome = error;
		    	
		    }
		    else {
		    	finalOutcome = even;
		    }
		    
		    
		    
		    //if statements to create Final outcome of program, giving user desired output
		    if(x == 999) {
		    	System.out.println("You have met the conditions to terminte the program.");
		    	System.exit(0);
		    }
		    if(finalOutcome == "error") {
		    	System.out.println("Java.lang.RuntimeException: unexpected type -- required even integer\n");
		    }
		    if(finalOutcome == "even") {
		    	System.out.println("Good job!\n");
		    }
		    
		    
		    //Calls clear function at beginning of loop after user input
		    System.out.println("Press ENTER to continue");
		    input.nextLine();
			
		}
		
	}
}
