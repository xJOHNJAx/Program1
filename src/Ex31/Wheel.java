package Ex31;

import javax.management.StringValueExp;

class Wheel implements AutomobileComponent {
    private double radius;
    private String seasonality;
    private String name;

    public enum Seasonality {
        WINTER, SUMMER, ALL_SEASON
    }

    public Wheel(double radius, String seasonality, String name) {
        this.radius = radius;
        this.seasonality = seasonality;
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public String getSeasonality() {
        return seasonality;
    }

    public String getName() {
        return name;
    }
    public String automobileShowInfo() {
        System.out.println("Радиус шины: " + this.radius);
        System.out.println("Сезонность шины: " + this.seasonality);
        System.out.println("Производитель шины: " + this.name);
        return null;
    }
}