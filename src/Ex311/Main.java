package Ex311;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4);
        Driver driver = new Driver("BMW");
        driver.operateCar("addPassenger");
        String action = new String();

        Scanner in = new Scanner(System.in);
        int i = 50;
        while (i > 0) {

            System.out.print("Введите действие (пример start, drive, refuel, addPassenger, removePassenger, stop) : ");
            action = in.next();
            String str = action;
            i--;

            switch (action) {
                case "start":
                    car.startEngine();
                    break;
                case "stop":
                    i = 0;
                    break;
                case "drive":
                    if (car.isEngineRunning()) {
                        System.out.println("Водитель ведет автомобиль.");
                    } else {
                        System.out.println("Сначала нужно завести двигатель.");
                    }
                case "refuel":
                    car.refuel(50); // предположим, что мы заправляем 50 единиц топлива
                    break;
                case "addPassenger":
                    car.addPassenger();
                    break;
                case "removePassenger":
                    car.removePassenger();
                    break;
                default:
                    System.out.println("Неизвестное действие.");
                    break;

            }
        }

    }
}