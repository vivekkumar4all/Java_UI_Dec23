package Loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int num = scanner.nextInt();

        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println("The reverse is" + reverse);
    }
}
