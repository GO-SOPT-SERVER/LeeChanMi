package AbstractClass;

public abstract class Car {
    private String type;
    private double fuelEfficiency;
    private double oilAmount;

    public Car(String type, double fuelEfficiency, double oilAmount) {
        this.type = type;
        this.fuelEfficiency = fuelEfficiency;
        this.oilAmount = oilAmount;
    }

    public abstract void go();

    public abstract void stop();

    public void fuelUp(int amount) {
        this.oilAmount += (double)amount;
    }

    public void fuelUp(double amount) {
        this.oilAmount += amount;
    }
}
