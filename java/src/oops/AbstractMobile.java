package oops;

public abstract class AbstractMobile {
    int batteryLife;

    // Abstract methods (no body)
    public abstract int getBatteryLife();
    public abstract void setBatteryLife(int battery);
    public abstract void displaySpecs();
}
