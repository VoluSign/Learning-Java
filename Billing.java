package main;

//main class
public class Billing {

	
	//Main function, ran on initialization, tests functions
	public static void main(String[] args) {
		//Initializes variables for prices, coupon values, and quantity ordered
		//These numbers change and will be pulled from website order info
		Integer photoBookPrice = 30;
		Integer quantityOrdered = 3;
		//20 percent off conversion to decimal done in head)
		double couponDecimalAmmountMultiplier = .80;

		//calls first function for test
		computeBill(photoBookPrice);
		
		//prints new line for spacing
		System.out.println("");
		
		//calls second function for test
		computeBill(photoBookPrice, quantityOrdered);
		
		//prints new line for spacing
		System.out.println("");
		
		//calls last function for test
		computeBill(photoBookPrice, quantityOrdered, couponDecimalAmmountMultiplier);
	}

	
	//First required function to print final total of item with tax
	public static void computeBill(Integer photoBookPrice){
		double finalTotal = photoBookPrice * 1.08;
		System.out.println("The final total of your order is: " + finalTotal);
	}	
	
	//Second required function to print final total of multiple items with tax
	public static void computeBill(Integer photoBookPrice, Integer quantityOrdered){
		double finalTotal = photoBookPrice * quantityOrdered * 1.08;
		System.out.println("The final total of your order is: " + finalTotal);
	}	

	//Second required function to print final total of multiple items with tax and coupon amount deducted
	public static void computeBill(Integer photoBookPrice, Integer quantityOrdered,  double couponDecimalAmmountMultiplier){
		double finalTotal = photoBookPrice * quantityOrdered * couponDecimalAmmountMultiplier * 1.08;
		System.out.println("The final total of your order is: " + finalTotal);
	}	
}
