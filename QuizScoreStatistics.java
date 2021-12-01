package main;

import java.util.*;

public class QuizScoreStatistics {

	public static void main(String[] args) {
		
		//Integer variables for determining amount, integer, sum, array, and mean
		Integer numbers = 0;
		Integer x = 0;
		Integer sum = 0;
		int intArray[] = new int[100];
		int high = 0;
		int low = 100;
		Integer average = 0;
		Integer averageRemainder = 0;
				
		//Scanner instantiation for user input
	    Scanner input = new Scanner(System.in);
	    
	    //User input
	    System.out.println("Please enter your test scores, pressing ENTER after each input.\nType '99' and press ENTER to terminate the program:\n");
	    while(true) {
		    String int1 = input.nextLine();
		    System.out.println();
		    
		    //Confirms that inputs are integers
		    try{
		    	
		      //putting the if statements inside of try so that if conditions aren't met, it will loop without causing issues.
		    	x = Integer.parseInt(int1);  
		    	intArray[x] = Integer.parseInt(int1);
		    	//if statements for assigning usage of integer
		    	if(x>10 && x<=100 && x!=99) {
		    		
		    		//adds to sum and number amount
			        sum = sum + x;
			        numbers+=1;
			        
			        
			        //sets low and high if conditions are met
			        if(x>high) {
			        	high = x;
			        }
			        if(x<low) {
			        	low = x;
			        }
			        
			        
			        System.out.println("\nNumber Added - Type '99' if you wish to terminate program.\n\nNext Score:\n");
		    	  }
		    	
		    	//following if statements find indeterminate values
		    	if(x<0) {
		    		System.out.println("\nThis score is less than 0, it will not be used.\n");
		    	}
		    	if(x>=0 && x<=10 && x<100) {
		    		System.out.println("\nThis score is in the lower percentile, it will not be added to the mean.\n");
		    	}
		    	if(x>100) {
		    		System.out.println("\nThis score is outside of the 100 point grading system,\nit will not be used.\n");
		    	}
		    	if(x == 99) {
		    		//creates output and ends loop
		    		System.out.println("\nYou have entered the stopping value.\n\n");
		    		average = sum/numbers;
		    		averageRemainder = sum%numbers;

		    		//Rounds up average if remainder != 1 so there's no double trouble
		    		if(averageRemainder!=0) {
		    			average += 1;
		    		}
		    		
		    		System.out.println("\nThe highest number in the list of scores entered is: " + high);
		    		System.out.println("\nThe lowest number in the list of scores entered is: " + low);
		    		System.out.println("\nThe rounded arithmetic average of the list of scores entered is: " + average);
		    		
		    		break;
		        }
		    	 
		      }
		    
		    
		    //Terminates program if conditions are not met
		    catch(Exception e){
		      System.out.print("You did not enter an acceptable integer, please try again.\n");
			    
			}
			
	    }
		
	}
}
