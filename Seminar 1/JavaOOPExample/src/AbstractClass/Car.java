package AbstractClass;

public abstract class Car {
    private String type;        //차종류
    private double fuelEfficiency; //연비
    private double oilAmount;   //기름양

    public Car (String type, double fuelEfficiency, double oilAmount) {
        this.type = type;
        this.fuelEfficiency = fuelEfficiency;
        this.oilAmount = oilAmount;
    }

    public abstract void go();
    public abstract void stop();

    //오버로딩
    public void fuelUp(int amount) {
        this.oilAmount += amount;
    }
    public void fuelUp(double amount) {
        this.oilAmount += amount;
    }
}
