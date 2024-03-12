package Homework112;
import java.util.Scanner;
public class MyFactorial {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число от 1 до 20: ");
            int num = in.nextInt();

            long result = 1;
            for (int i = 1; i <= num; i++) {
                result = result * i;
            }
            System.out.println("Результат произведения чисел от 1 до " + num + ": " + result);
        }
    }

