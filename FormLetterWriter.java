package main;

//main class
public class FormLetterWriter {

	
	//Main function, ran on initialization, tests functions
	public static void main(String[] args) {
		//Initializes variables for names
		//These names are test replacements, real items would be pulled from a database
		String fName = "Kendall";
		String lName = "Smith";
		
		//calls first function for test
		displaySalutation(lName);
		
		//prints new line for spacing
		System.out.println("");
		
		//calls second function for test
		displaySalutation(fName, lName);
		
	}

	//First required function to print last name and short business letter
	public static void displaySalutation(String lName){
		System.out.println("Dear Mr. or Ms. " + lName + ", thank you for your recent order.");
	}	
	
	//Second required function to print "first, last" and short business letter
	public static void displaySalutation(String fName, String lName){
		System.out.println("Dear " + fName + " " + lName + ", thank you for your recent order.");
	}
	

}



