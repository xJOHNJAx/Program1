package CarsAndDrivers;

public abstract class Driver implements CarComponent {
    private int drivingExperience;
    private String[] driverIsLicenseCategories;
    private String carKey;

    public Driver(int drivingExperience, String[] driverIsLicenseCategories, String carKey) {
        this.drivingExperience = drivingExperience;
        this.driverIsLicenseCategories = driverIsLicenseCategories;
        this.carKey = carKey;
    }

    @Override
    public void CarShowInfo() {
        System.out.println("drivingExperience=" + this.drivingExperience);
        System.out.println("driverIsLicenseCategories=" + this.driverIsLicenseCategories);
        System.out.println("carKey= " + this.carKey);
    }

    @Override
    public void getTheName() {
        System.out.println("drivingExperience=" + this.drivingExperience);
        System.out.println("driverIsLicenseCategories=" + this.driverIsLicenseCategories);
        System.out.println("carKey= " + this.carKey);

    }
}






