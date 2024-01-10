package Loops;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();

        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        System.out.println("This is the Sum : " + sum);
    }
}
