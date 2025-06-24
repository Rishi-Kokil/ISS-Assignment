package oops;

class Samsung extends Mobile {
	private int costInRupees = 50000;
	String modelName = "Samsung Galaxy S25 Ultra";
	boolean isAvailable = true;

	// Method Overriding
	@Override
	public void displaySpecs() {
		super.displaySpecs(); // Calls parent class method
		System.out.println("Model: " + modelName);
		System.out.println("Available: " + isAvailable);
		System.out.println("Cost: ₹" + costInRupees);
	}
 
	public int getCostInRupees() {
		return costInRupees;
	}

	public void setCostInRupees(int costInRupees) {
		this.costInRupees = costInRupees;
	}
}
 

public class InheritanceDemo {
	public static void main(String[] args) {

		System.out.println("=== Parent Object ===");
		Mobile m = new Mobile();
		m.displaySpecs();
		m.showInfo();
		m.showInfo("Generic Mobile");

		System.out.println("\n=== Child Object ===");
		Samsung s = new Samsung();
		s.displaySpecs(); 
		s.setBatteryLife(5000); 
		System.out.println("Updated Battery Life: " + s.getBatteryLife());

		System.out.println("\n=== Polymorphism Example ===");
		Mobile ref = new Samsung(); // Parent Class Reference Variable used to Access Child Class Object
		ref.displaySpecs(); // Calls Samsung's version (runtime polymorphism)

		// Cannot access private members from parent
		// System.out.println(s.batteryLife); not accessible directly
	}
}

