package CarsAndDrivers;

public class Car {
    private Engine engine;
    private Tyre[] tyre;
    private int numberOfSeats;
    private String driverIsLicenseCategory;
    private CarLock carLock;

    public Car(Engine engine, Tyre[] tyre, int numberOfSeats, String driverIsLicenseCategory, CarLock carLock) {
        this.engine = engine;
        this.tyre = tyre;
        this.numberOfSeats = numberOfSeats;
        this.driverIsLicenseCategory = driverIsLicenseCategory;
        this.carLock = carLock;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", tyre=" + Arrays.toString(tyre) +
                ", numberOfSeats=" + numberOfSeats +
                ", driverIsLicenseCategory='" + driverIsLicenseCategory + '\'' +
                ", carLock=" + carLock +
                '}';
    }
}




