package CarsAndDrivers;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private int numberOfSeats;
    private String DriverIsLicenseCategory;
    private Lock lock;

    public Car(Engine engine, Wheel[] wheels, int numberOfSeats, String DriverIsLicenseCategory, Lock lock) {
        this.engine = engine;
        this.wheels = wheels;
        this.numberOfSeats = numberOfSeats;
        this.DriverIsLicenseCategory = DriverIsLicenseCategory;
        this.lock = lock;
    }
}


