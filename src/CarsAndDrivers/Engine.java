package CarsAndDrivers;

abstract class Engine implements CarComponent {
    protected double engineCapacity;
    protected String fuelType;
    protected String engineType;

    public Engine(double engineCapacity, String fuelType, String engineType) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.engineType = engineType;
    }
    @Override
    public void getTheName() {
        System.out.println("engineCapacity= "+this.engineCapacity);
        System.out.println("fuelType="+this.fuelType);
        System.out.println("fuelType="+this.engineType);
    }
 }

