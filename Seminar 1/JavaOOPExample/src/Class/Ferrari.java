package Class;
import AbstractClass.Car;
import Interface.SportsCar;

public class Ferrari implements SportsCar {
    private int maxSpeed;
    public Ferrari(int maxSpeed){
        maxSpeed = this.maxSpeed;
    }
    @Override
    public void go() {
        System.out.println("페라리 주행하다");
    }
    @Override
    public void stop() {
        System.out.println("페라리 정지하다");
    }
    @Override
    public void drift() {
        System.out.println("드리프트!!");
    }
    public void open(){
        System.out.println("차량커버 열기");
    }
    public void close(){
        System.out.println("차량커버 닫기");
    }
}