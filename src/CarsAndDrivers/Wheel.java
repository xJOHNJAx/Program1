package CarsAndDrivers;

public class Wheel {
    class Wheel implements Components {
        private double radius;
        private Seasonality seasonality;
        private String name;

        public enum Seasonality {
            Winter, Summer, AllSeasons
        }

        public Wheel(double radius, Seasonality seasonality, String name) {
            this.radius = radius;
            this.seasonality = seasonality;
            this.name = name;
        }

        public double getRadius() {
            return radius;
        }

        public Seasonality getSeasonality() {
            return seasonality;
        }
    }
    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", seasonality=" + seasonality +
                ", name='" + name + '\'' +
                '}';
    }
}