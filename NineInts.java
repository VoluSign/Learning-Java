package main;

import java.util.Scanner;

public class NineInts {

	public static void main(String[] args) {
		
		//instantiates array of integers
		int ints[];
		ints = new int[9];
		
		//integer variables for index identification
		int x = 0;
		int temp = 9;
		
		//instantiates scanner and prints introduction
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter nine integers pressing ENTER after each input.\nYour integers will be presented in forward and reverse order:\n");

		
		
		//user inputs integers and they are added to array
		for(int i = 1; i < 10; i++) {
			
			//adds to the array through try catch statement
			try {
			ints[x] = input.nextInt();
			x++;
			}
			//error check
			catch(Exception e) {
				System.out.println("\nYou did not enter a valid integer, please restart and try again.\n");
				System.exit(0);
			}
		}
		
		
		//output for code in forward and reverse
		
		//forward
		System.out.print("\nIntegers in the forward direction:\n");
		for(int i = 0; i < 9; i++) {
			
			
			System.out.print(ints[i]);
			
			if(i != 8) {
				System.out.print(", ");
			}
		}
		
		//reverse (using x variable from before to go backwards)
		System.out.print("\n\n");
		System.out.print("Integers in the reverse direction:\n");
		for(int i = 0; i < 9; i++) {
			
			x-=1;
			System.out.print(ints[x]);
			
			
			if(x != 0) {
				System.out.print(", ");
			}
		}
		

	}

}
