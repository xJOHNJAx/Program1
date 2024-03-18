package Ex31;

class Driver implements AutomobileComponent{
    private int drivingExperience;
    private String licenseCategories;
    private String key;

    public Driver(int drivingExperience, String licenseCategories, String key) {
        this.drivingExperience = drivingExperience;
        this.licenseCategories = licenseCategories;
        this.key = key;
    }

    @Override
    public String automobileShowInfo() {
        System.out.println("Стаж вождения: "+this.drivingExperience);
        System.out.println("Категория водительского удостоверения: "+this.licenseCategories);
        System.out.println("Пин-код ключа - "+this.key);
        return null;
    }
}
