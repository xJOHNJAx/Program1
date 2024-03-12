package Homework22;

public class SecondNumber {
    public static void main(String[] args) {
        int array[] = {0, 2, 4, 6, 8};
        for (int i = 0; i < array.length; i = i + 2) {
            System.out.print(array[i] + " ");
        }
    }
}