package oops;

class Mobile {
	private int batteryLife = 4500;

	public void displaySpecs() {
		System.out.println("Battery Life: " + batteryLife + " mAh");
	}
 
	public int getBatteryLife() {
		return batteryLife;
	} 

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
	
	// Method Overloading (Same method name, different parameters)
	public void showInfo() {
		System.out.println("Mobile Information");
	}

	public void showInfo(String brand) {
		System.out.println("Mobile Brand: " + brand);
	}
}
