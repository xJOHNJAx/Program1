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








//        }
//        Engine mondeoEngine = new MondeoEngine();
//        Wheel[] mondeoWheels = {new MondeoWheel(), new MondeoWheel(), new MondeoWheel(), new MondeoWheel()};
//        Lock mondeoLock = new MondeoLock("MondeoKey123");
//        FordMondeo myMondeo = new FordMondeo(mondeoEngine, mondeoWheels, mondeoLock);
//        Driver me = new MondeoDriver(10, new String[]{"B"}, "MondeoKey123");
//    }
//    {

        /*System.out.println("Информация о колесах: " + mondeoWheel[0].getName());
        System.out.println("Количество мест: " + myMondeo.seatCount);
        System.out.println("Категория прав: " + myMondeo.licenseCategory);
        System.out.println("Стаж вождения: " + me.drivingExperience + " лет");
        System.out.println("Категории прав водителя: " + Arrays.toString(me.licenseCategories));
    }*/

//        }
//
//    }


