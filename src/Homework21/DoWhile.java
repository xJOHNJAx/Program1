package Homework21;
public class DoWhile {
    public static void main(String[] args) {
// Объявляем и инициализируем массив
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("\nПеребор с помощью цикла do...while:");
        int j = 0;
        do {
            System.out.println(array[j]);
            j++;
        } while (j < array.length);
    }
}


