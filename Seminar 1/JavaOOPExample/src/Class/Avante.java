package Class;

import AbstractClass.Car;

public class Avante extends Car {
    private int price;

    public Avante(String type, double fuelEfficiency, double oilAmount, int price) {
        super(type, fuelEfficiency, oilAmount);
        this.price = price;
    }

    public void go() {
        System.out.println("아반떼 주행하다");
    }

    public void stop() {
        System.out.println("아반떼 정지하다");
    }

    public void goBack() {
        System.out.println("후진하다");
    }
}
