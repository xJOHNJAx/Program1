package Ex311;

public class Engine implements DriverCarShow{
    private String startEngine;
    private String stopEngine;
    private String isEngineRunning;
    private String refuel;

    public Engine(String startEngine, String stopEngine, String isEngineRunning, String refuel) {
        this.startEngine = startEngine;
        this.stopEngine = stopEngine;
        this.isEngineRunning = isEngineRunning;
        this.refuel = refuel;
    }
    @Override
    public void DriverCarInfoShow() {
        System.out.println("Старт двигателя"+this.startEngine);
        System.out.println("Остановка двигателя"+this.stopEngine);
        System.out.println("Двигатель работает"+this.isEngineRunning);
        System.out.println("Заправка автомобиля"+this.refuel);
    }
}

