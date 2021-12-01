package main;

import java.util.*;

public class Majors {

	public static void main(String[] args) {
		
		//string variable for enumeration logic
		String Major;

		//instantiates scanner
		Scanner inp = new Scanner(System.in);
		
		//user prompt
		System.out.println("Enter Major:\n");
		
		//display enumeration
		for (majors maj: majors.values()) {
		
		//prints majors sequentially
		System.out.println(maj);	
		
		}
		
		//get user input
		Major = inp.nextLine();
		
		//--display division--//
		
		//tests string with enumeration
		switch (Major) {
		
		//logic for Business division
		case "ACC":
		case "CIS":
		System.out.println("\n" + Major + " falls under the Business division");
		break;
		
		//logic for Science division.
		case"CHEM":
		case"PHYS":
		System.out.println("\n" + Major + " falls under the Science division");
		break;
		
		//logic for Humanities division.
		case"ENG":
		case"HIS":
		System.out.println("\n" + Major + " falls under the Humanities division");
		break;
		
		//When the user inputs something not inside enumeration
		default:
		System.out.println("\n" + Major + " is not a major.");
		
		//----//
		
		}

	}

}

//instantiates enumeration for main function
enum majors{ACC, CHEM, CIS, ENG, HIS, PHYS}