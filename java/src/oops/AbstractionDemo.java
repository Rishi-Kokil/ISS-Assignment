package oops;

//Inheriting the Abstract Class
class Apple extends AbstractMobile {
    private int costInRupees;
    private String modelName;

    public Apple(String modelName, int batteryLife, int cost) {
        this.modelName = modelName;
        this.batteryLife = batteryLife;
        this.costInRupees = cost;
    }
    
    // Implementing all the Abstract Methods
    @Override
    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public void setBatteryLife(int battery) {
        this.batteryLife = battery;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Model: " + modelName);
        System.out.println("Battery: " + batteryLife + " mAh");
        System.out.println("Cost: ₹" + costInRupees);
    }
}


public class AbstractionDemo {
    public static void main(String[] args) {

        // AbstractMobile mobile = new AbstractMobile(); Not allowed

        AbstractMobile myPhone = new Apple("Iphone 15", 5000, 79999);
        myPhone.displaySpecs();

        System.out.println("Battery Life: " + myPhone.getBatteryLife());

        myPhone.setBatteryLife(5200);
        System.out.println("Battery after update: " + myPhone.getBatteryLife());
    }
}




