import AbstractClass.Car;
import Class.Avante;
import Class.Morning;
import Class.Ferrari;
import Class.Box;

public class Main {
    public static void main(String[] args) {
        Avante avante = new Avante("mid size", 15.2, 122, 19600000);
        Morning sonata = new Morning("small size", 12.7, 35, 9000000);

        go(avante);
        go(sonata);

        Ferrari ferrari = new Ferrari(330);
        ferrari.go();
        ferrari.drift();

        Box<String, Integer> box = new Box<String, Integer>(new String[]{"인형", "태블릿", "노트북"}, 3);
        Main.<String>printArray(box.getContents());
    }
    //제네릭 메소드
    public static <T> void printArray(T[] array){
        for(T element : array) {
            System.out.println(element);
        }
    }
    public static void go(Car car) {
        car.go();
    }
}