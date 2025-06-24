package javabasics;

/**
 * Concepts Discussed : Variable Types, Modifier Types, Final Keyword, Constructors and Types of constructors
 * Variable Types : Instance Variables,Static Variables, Local Variables, Parameters
 * Modifier Types : Default, Public, Private, Protected
 * Constructors : Default Constructor, Parameterised Constructor, Constructor Overloading
 */

public class JavaBasics {
	public static void main(String[] args) {
		
		//Local Variable
		int totalPrice = 0;
		
		//Default Constructor
		Mobile mobile1 = new Mobile();
		System.out.println("Output from the Default Constructor : ");
		mobile1.displaySpecs();
		
		//Parameterised Constructor
		Mobile mobile2 = new Mobile("Samsung",  69999, false, 4500.50, 'A');
		System.out.println("Output from the Parameterised Constructor :");
		mobile2.displaySpecs();
		
		//Overloaded Constructor
		Mobile mobile3 = new Mobile("Samsung" ,  50000, false);
		System.out.println("Output from the Parameterised Constructor :");
		mobile3.displaySpecs();
		
		totalPrice = totalPrice + mobile1.getPriceInRupees()+ mobile2.getPriceInRupees()+mobile3.getPriceInRupees();
		
		System.out.println("Total Cost of All Phones : " + totalPrice );
		
		//Accessing Static Variable
		System.out.println("Total No of Mobile Instance Variables Created are : " + Mobile.mobileCreated);
		
		
		// mobile1.brandName = "hello";   <--- when tried to change the Final Variable it throws error
		
		//Accessing Protected Variable 
		System.out.println("Protected Variable value : " + mobile1.mobileSold);
	}
	
	
}
