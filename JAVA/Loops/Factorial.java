package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("This is the Fact :" + fact);

    }
}
