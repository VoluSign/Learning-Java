package main;

import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		
		//String variables for final output string
		String even = "even";
		String odd = "odd";
		String finalOutcome = "";
		
		//Scanner instantiation for user input
	    Scanner input = new Scanner(System.in);
	    
	    //User input
	    System.out.println("Please enter an Integer:");
	    String usrInp = input.nextLine();
	    
	    //Confirms that input is an integer
	    try{
	      Integer.parseInt(usrInp);
	    }
	    
	    //Terminates program if conditions are not met
	    catch(Exception e){
	      System.out.print("You did not enter an integer, or your number is too large for primitive data types, please restart the program and try again.");
	      System.exit(0);
	    }
	    
	    //Assigns new variable for sequence if conditions are met
	    Integer usrInt = Integer.valueOf(usrInp);

	    //Gets remainder value when divided by two so that the symmetry relation can be determined
	    Integer evenodd = usrInt % 2;
	    
	    
	    //if else statement determining remainder value of aforementioned funtion (if var = 0: outcome is even; if var = 1: outcome is odd)
	    if(evenodd != 0) {
	    	finalOutcome = odd;
	    	
	    }
	    else {
	    	finalOutcome = even;
	    }
	    
	    //Final outcome of program, giving user desired output
	    System.out.println();
	    System.out.println("The symmetry relation of your number is " + finalOutcome + ".");

	    
	  }

}
