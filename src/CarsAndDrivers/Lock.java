package CarsAndDrivers;
public class Lock {
    private String pin;

    public Lock(String) {
        this.pin = pin;
    }

    public boolean open(String key) {
        return key.equals(pin);
    }

    @Override
    public String toString() {
        return "Lock{" +
                "pin='" + pin + '\'' +
                '}';
    }
}
