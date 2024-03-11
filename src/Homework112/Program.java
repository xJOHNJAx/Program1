package Homework112;
import java.util.Scanner;
public class Program {
    public static void main(String[] args)
    {
        System.out.print("Введите число: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long factorialResult = factorialRecursive(num);
        System.out.println(factorialResult);
    }
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1 )
            return 1;
        return n * factorialRecursive(n - 1);
    }
}