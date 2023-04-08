package Class;

import AbstractClass.Car;

public class Morning extends Car {
    private int price;
    public Morning (String type, double fuelEfficiency, double oilAmount, int price){
        super(type, fuelEfficiency, oilAmount);
        this.price = price;
    }

    @Override
    public void go(){
        System.out.println("소나타 주행하다");
    }
    @Override
    public void stop(){
        System.out.println("소나타 정지하다");
    }
    public void goBack(){
        System.out.println("후진하다");
    }
}
