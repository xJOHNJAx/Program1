package Homework3;
public class Crack {
    public static void main(String[] args) {
// Создаем массив объектов разных классов
        Object[] objects = new Object[5];
// Наполняем массив объектами
        objects[0] = new String("Привет, мир!");
        objects[1] = new Integer(42);
        objects[2] = new Double(3.14);
        objects[3] = new Boolean(true);
        objects[4] = new Character('A');
// Перебираем массив и печатаем информацию об объектах
        for (Object obj : objects) {
// Выводим тип объекта и его значение
            System.out.println("Объект класса: " + obj.getClass().getSimpleName() + ", Значение: " + obj.toString());
        }
    }
}
