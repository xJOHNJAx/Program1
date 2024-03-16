package CarsAndDrivers;

    abstract class Engine implements Components {
        protected double engineСapacity;
        protected String fuelType;
        protected String name;

        public Engine(double engineСapacity, String fuelType, String name) {
            this.engineСapacity = engineСapacity;
            this.fuelType = fuelType;
            this.name = name;
        }

        public double getEngineСapacity() {
            return engineСapacity;
        }

        public String getFuelType() {
            return fuelType;
        }

    @Override
    public String toString() {
        return "Engine{" +
                "engineСapacity=" + engineСapacity +
                ", fuelType='" + fuelType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
