package oops;

class Vivo extends Mobile{
	String brandName = "Vivo V15";
	
	@Override
	public void displaySpecs() {
		super.displaySpecs();
		System.out.println("Brand Name : " + this.brandName);
	}
	
	public void showBatteryInfo() {
        System.out.println("Battery info not available");
    }

    public void showBatteryInfo(int battery) {
        System.out.println("Battery capacity: " + battery + " mAh");
    }

    public void showBatteryInfo(int battery, String model) {
        System.out.println("Battery of " + model + ": " + battery + " mAh");
    }
}

public class PolymorphismDemo {
	public static void main(String[] args) {
		
		System.out.println("Runtime Polymorphism");
		
		System.out.println("Parent Class Reference to Parent class object ");
		Mobile mobileRef = new Mobile();
		mobileRef.displaySpecs();
		
		System.out.println("\nParent Class Reference to Child class object");
		mobileRef = new Vivo();
		mobileRef.displaySpecs();
		
		System.out.println("\nCompile Time Polymorphism (Method Overloading)");
		Vivo vivoRef = new Vivo();
		vivoRef.showBatteryInfo();
		vivoRef.showBatteryInfo(4567);
		vivoRef.showBatteryInfo(1235, "Vivo V15");
	}
}
