package datatypes;


/**
 * Demonstrates usage of various datatypes using the Mobile Class
 * Concepts : Class, Object Creation, Primitive Data Types, Constructor and Method Invocation
 */


public class DataTypes {
	
	public static void main(String[] args) {
		
		//Creating Mobile class object using Constructor
		Mobile mobile1 = new Mobile( (byte) 1, (short) 11, 69999, 123456789012345L, true, 6.5f, 4500.50, 'A');
		mobile1.displaySpecs();
		
		System.out.println("Modifying Object using setters.....");
		
		//updating values using setter
		mobile1.setBatteryCapacity(5050.5f);
		mobile1.setEnergyRating('B');
		
		System.out.println("After Changing Some values the new Object is as Follows :");
		mobile1.displaySpecs();
		
	}

}
