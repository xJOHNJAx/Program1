package Ex31;

class Automobile implements AutomobileComponent{
    private Double engine;
    private String wheels;
    private int seatCount;
    private String licenseCategory;
    private int lock;

    public Automobile(Double engine, String wheels, int seatCount, String licenseCategory, int lock) {
        this.engine = engine;
        this.wheels = wheels;
        this.seatCount = seatCount;
        this.licenseCategory = licenseCategory;
        this.lock = lock;}

        @Override
        public String automobileShowInfo () {
            System.out.println("Объём двигателя: " + this.engine);
            System.out.println("Количество колёс: " + this.wheels);
            System.out.println("Количество мест: " + this.seatCount);
            System.out.println("Категория водительских прав: " + this.licenseCategory);
            System.out.println("Пароль от замка: " + this.lock);
            return null;
        }
    }

