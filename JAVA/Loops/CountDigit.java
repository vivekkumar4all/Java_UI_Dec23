package Loops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("The count is :" + count);
    }
}
