package Ex311;

public class Car {
    private boolean engineRunning;
    private int fuelLevel;
    private int passengerCount;
    private final int maxPassengers;

    public Car(int maxPassengers) {
        this.engineRunning = false;
        this.fuelLevel = 100; // предположим, что бак полный
        this.passengerCount = 0;
        this.maxPassengers = maxPassengers;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }
    public void startEngine() {
        if (!engineRunning && fuelLevel > 0) {
            engineRunning = true;
            System.out.println("Двигатель заведен.");
        } else {
            System.out.println("Двигатель уже заведен или нет топлива.");
        }
    }

    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
            System.out.println("Двигатель заглушен.");
        } else {
            System.out.println("Двигатель уже не работает.");
        }
    }

    public void refuel(int fuel) {
        fuelLevel += fuel;
        System.out.println("Автомобиль заправлен на " + fuel + " единиц топлива.");
    }

    public void addPassenger() {
        if (passengerCount < maxPassengers) {
            passengerCount++;
            System.out.println("Пассажир добавлен. Всего пассажиров: " + passengerCount);
        } else {
            System.out.println("Невозможно добавить пассажира. Автомобиль полон.");
        }
    }

    public void removePassenger() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("Пассажир вышел. Всего пассажиров: " + passengerCount);
        } else {
            System.out.println("В автомобиле нет пассажиров.");
        }
    }
}