package javabasics;

public class Mobile {
	
	//Final Keyword
	final public String brandName;
	
    // Static variable to track total mobiles created
    static int mobileCreated = 0;
    

    // Instance variables
    private int priceInRupees;
    private boolean isAvailable;
    private double batteryCapacity;
    private char energyRating;
    
    protected int mobileSold = 0;

    // Constructor
    public Mobile() {
    	mobileCreated += 1;
    	this.brandName = "";
    	
    }
    public Mobile(String brandName, int priceInRupees, boolean isAvailable, double batteryCapacity, char energyRating) {
        mobileCreated += 1;
        this.brandName = brandName;
        this.priceInRupees = priceInRupees;
        this.isAvailable = isAvailable;
        this.batteryCapacity = batteryCapacity;
        this.energyRating = energyRating;
    }
    
    public Mobile(String brandName, int priceInRupees, boolean isAvailable) {
    	mobileCreated += 1;
    	this.brandName = brandName;
    	this.priceInRupees = priceInRupees;
    	this.isAvailable = isAvailable;
    }

    // Getters and Setters    
    public int getPriceInRupees() {
        return priceInRupees;
    }

    public void setPriceInRupees(int priceInRupees) {
        this.priceInRupees = priceInRupees;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public char getEnergyRating() {
        return energyRating;
    }

    public void setEnergyRating(char energyRating) {
        this.energyRating = energyRating;
    }
    

    // Method to display object state
    public void displaySpecs() {
    	System.out.println("Brand Name         : " + brandName);
        System.out.println("Price (INR)        : " + priceInRupees);
        System.out.println("Available          : " + isAvailable);
        System.out.println("Battery Capacity   : " + batteryCapacity + " mAh");
        System.out.println("Energy Rating      : " + energyRating);
    }
}
