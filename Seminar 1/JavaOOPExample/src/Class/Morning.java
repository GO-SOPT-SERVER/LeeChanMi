package Class;

import AbstractClass.Car;

public class Morning extends Car {
    private int price;

    public Morning(String type, double fuelEfficiency, double oilAmount, int price) {
        super(type, fuelEfficiency, oilAmount);
        this.price = price;
    }

    public void go() {
        System.out.println("모닝 주행하다");
    }

    public void stop() {
        System.out.println("모닝 정지하다");
    }

    public void goBack() {
        System.out.println("후진하다");
    }
}
