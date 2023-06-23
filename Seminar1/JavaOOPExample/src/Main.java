import Class.Box;
import Class.Ferrari;
import Class.Morning;
import Class.Avante;
import AbstractClass.Car;

public class Main {
    public static void main(String[] args) {
        Avante avante = new Avante("mid size", 15.2, 122.0, 19600000);
        Morning morning = new Morning("small size", 12.7, 35.0, 9000000);
        go(avante);
        go(morning);
        Ferrari ferrari = new Ferrari(330);
        ferrari.go();
        ferrari.drift();
        Box<String, Integer> box = new Box(new String[]{"인형", "태블릿", "노트북"}, 3);
        printArray((String[])box.getContents());
    }

    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }

    public static void go(Car car) {
        car.go();
    }
}

