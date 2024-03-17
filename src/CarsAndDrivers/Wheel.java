package CarsAndDrivers;

public class Wheel implements CarComponent {
    private double radius;
    private Seasonality seasonality;
    private String name;

    public Wheel(double radius, Seasonality seasonality, String name) {
        this.radius = radius;
        this.seasonality = seasonality;
        this.name = name;
    }

    @Override
    public void getTheName() {
        System.out.println("Tyre" + this.radius);
        System.out.println("seasonality= " + this.seasonality);
        System.out.println("name= " + this.name);
    }
}
