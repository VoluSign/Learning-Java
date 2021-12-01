package main;

import java.util.*;

public class DistanceFromAverage {

	public static void main(String[] args) {
		
		//double variables for determining amount, value, sum, array, index identification, temp variable for distance and mean
		double numbers = 0;
		double x;
		double sum = 0;
		double valArray[] = new double[100];
		int index = 0;
		int index2 = 0;
		double temp = 0;
		double average = 0;
				
		//Scanner instantiation for user input
	    Scanner input = new Scanner(System.in);
	    
	    //User input
	    System.out.println("Please enter any ammount of decimal values up to 15, pressing ENTER after each input.\nType '99999' and press ENTER to terminate the program:\n");
	    while(true) {
		    String value = input.nextLine();
		    System.out.println();
		    
		    //Confirms that inputs are integers
		    try{
		    	
		      //putting the if statements inside of try so that if conditions aren't met, it will loop without causing issues.
		    	x = Double.parseDouble(value);  
		    	
		    	if(x<=15 && x!=99999) {
		    		valArray[index] = Double.parseDouble(value);
			    	//if statements for assigning usage of integer
		    		
		    		//adds to sum and number amount
			        sum = sum + x;
			        numbers += 1;
			        index += 1;
			       
			        
			        
			        System.out.println("\nNumber Added - Type '99999' if you wish to terminate program.\n\nNext double:\n");
		    	  }
		    	
		    	if(x>15 && x != 99999) {
		    		System.out.println("\nThis number is not less than 15. Try again..\n");
		    	}
		    	if(x == 99999) {
		    		//creates output and ends loop
		    		if(sum != 0) {
			    		System.out.println("\nYou have entered the stopping value.\n\n");
			    		
			    		//average calculation
			    		average = sum/numbers;
	
			    		System.out.println("\nThe arithmetic average of the list of numbers entered is: " + average);
			    		System.out.println("\nThe following is the list of numbers entered, and their distance from the average:");
			    		
			    		//prints items distance away from average
			    		while(numbers != 0) {
			    			
			    			temp = average - valArray[index2];
			    			System.out.println(valArray[index2] + " is " + Math.abs(temp) + " units away from the average.");
			    			index2 += 1;
			    			numbers -= 1;
			    		}
			    		
			    		
			    		break;
		    		}
		    		else {
		    			System.out.println("You did not enter any numbers..\nTry again\n");
		    		}
		        }
		    	else {
		    		
		    	}
		    	 
		      }
		    
		    
		    //Terminates program if conditions are not met
		    catch(Exception e){
		      System.out.print("You did not enter an acceptable integer, please try again.\n");
			    
			}
			
	    }
		
	}
}
