package CarsAndDrivers;

public class Program2 {
    public void openAndStart(Car car) {
        if (car.lock.open(key)) {
            System.out.println("Автомобиль открыт и заведен.");
        } else {
            System.out.println("Неверный ключ!");
        }
        public void driving() {
            System.out.println("Вождение автомобиля.");

        }
        public void toAcceptPassengers(Car car,int quantity){
            if (quantity <= quantity.numberOfSeats) {
                System.out.println("Пассажиры приняты.");
            } else {
                System.out.println("Слишком много пассажиров!");
            }
        }
    }
}
