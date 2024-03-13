package Homework23;
public class Null {
    public static void main(String[] args) {
// Объявляем и инициализируем массив с null элементами
        Integer[] array = {1, 2, null, 4, 5, null, 7, 8, 9, 10};
// Выводим каждый второй элемент массива
        for (int i = 1; i < array.length; i += 2) {
// Проверяем, не равен ли элемент null
            if (array[i] == null) {
// Прерываем цикл, если элемент равен null
                break;
            }
            System.out.println(array[i]);
        }
    }
}
