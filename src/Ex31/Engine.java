package Ex31;

class Engine implements AutomobileComponent {
    private double volume;
    private String fuelType;
    private String name;

    public Engine(double volume, String fuelType, String name) {
        this.volume = volume;
        this.fuelType = fuelType;
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getName() {
        return name;
    }

    public String automobileShowInfo() {
        System.out.println("Информация о двигателе: " + this.name);
        System.out.println("Объем двигателя: " + this.volume);
        System.out.println("Тип топлива: " + this.fuelType);
        return null;
    }
}
