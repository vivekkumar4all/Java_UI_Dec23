package Loops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner abcd = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = abcd.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
        abcd.close();
    }
}
