package Loops;

import java.util.Scanner;

public class EvenOddRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        int lower = sc.nextInt();
        System.out.println("Enter the upper limit");
        int upper = sc.nextInt();

        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
    }
}
