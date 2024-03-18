package Ex31;

public class Program {
    public static void main(String[] args) {
        Engine engine = new Engine(1.8, "Petrol", "Durateq");
        Driver driver = new Driver(14,"B","1234");
        Wheel wheel = new Wheel(16,"All Season","Nexen");
        Automobile automobile = new Automobile(1.8,"4",5,"B", 1234);
        engine.automobileShowInfo();
        driver.automobileShowInfo();
        wheel.automobileShowInfo();
        automobile.automobileShowInfo();}

}







