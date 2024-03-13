package Homework21;
public class While {
    public static void main(String[] args) {
// Объявляем и инициализируем массив
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("\nПеребор с помощью цикла while:");
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }
}

