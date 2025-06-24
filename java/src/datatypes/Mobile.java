package datatypes;

class Mobile {
    private byte brandCode;           // numeric code for brand (e.g. Apple => 1)
    private short modelCode;          // Code for model type (e.g. Iphone 11 => 11) 
    private int priceInRupees;        // Price of the mobile (Whole number)
    private long serialNumber;        // Unique serial number (e.g., IMEI)
    private boolean isAvailable;      // Availability status
    private float screenSizeInInches; // (e.g., 6.5f)
    private double batteryCapacity;   // Battery in mAh (e.g., 4500.50)
    private char energyRating;        // Rating label (e.g., 'A', 'B', etc.)
    
    //Constructor
    Mobile(byte brandCode, 
    		short modelCode, 
    		int priceInRupees, 
    		long serialNumber, 
    		boolean isAvailable,
    		float screenSizeInInches, 
    		double batteryCapacity, 
    		char energyRating) {
    	this.brandCode = brandCode;
    	this.modelCode = modelCode;
    	this.priceInRupees = priceInRupees;
    	this.serialNumber = serialNumber;
    	this.isAvailable = isAvailable;
    	this.screenSizeInInches = screenSizeInInches;
    	this.batteryCapacity = batteryCapacity;
    	this.energyRating = energyRating;
    }
    
    // Getters and Setters
    public byte getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(byte brandCode) {
        this.brandCode = brandCode;
    }

    public short getModelCode() {
        return modelCode;
    }

    public void setModelCode(short modelCode) {
        this.modelCode = modelCode;
    }

    public int getPriceInRupees() {
        return priceInRupees;
    }

    public void setPriceInRupees(int priceInRupees) {
        this.priceInRupees = priceInRupees;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public float getScreenSizeInInches() {
        return screenSizeInInches;
    }

    public void setScreenSizeInInches(float screenSizeInInches) {
        this.screenSizeInInches = screenSizeInInches;
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
    
    public void displaySpecs() {
        System.out.println("Brand Code         : " + this.brandCode);
        System.out.println("Model Code         : " + this.modelCode);
        System.out.println("Price (INR)        : " + this.priceInRupees);
        System.out.println("Serial Number      : " + this.serialNumber);
        System.out.println("Available          : " + this.isAvailable);
        System.out.println("Screen Size (in)   : " + this.screenSizeInInches);
        System.out.println("Battery Capacity   : " + this.batteryCapacity + " mAh");
        System.out.println("Energy Rating      : " + this.energyRating);
    }
    
}
