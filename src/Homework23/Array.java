package Homework23;

public class Array {
    private String[] arr;

    public Array(String[] arr) {
        this.arr = arr;
    }

    public void DisplayFor() {
        for (int i = 0; i <= arr.length - 1; i++) {
            String num = arr[i];
            int remainder = i % 2;
            if (num == null) {
                System.out.print(">>> \n");
                break;
            }
            if (i != arr.length - 1) {
                if (remainder == 1) {

                    System.out.print(num + ";");
                }
            } else {
                System.out.print(num + " >>> \n");
            }

        }
    }

    public void DisplayDoWhile() {
        int i = 0;
        do {
            String item = arr[i];
            int remainder = i % 2;
            if (item == null) {
                System.out.print(">> \n");
                break;
            }
            if (i == arr.length - 1) {
                System.out.printf(item + " >> \n");

            } else {
                if (remainder == 1) {
                    System.out.printf(item + "!");
                }
            }
            i++;
        } while (i <= arr.length - 1);
    }

    public void DisplayWhile() {
        int i = 0;
        while (i <= arr.length - 1) {
            int remainder = i % 2;
            String item = arr[i];
            if (item == null) {
                System.out.print(">> \n");
                break;
            }
            if (i == arr.length - 1) {
                System.out.printf(item + " => \n");
            } else {
                if (remainder == 1) {
                    System.out.printf(item + ":");
                }
            }
            i++;
        }
    }
}
