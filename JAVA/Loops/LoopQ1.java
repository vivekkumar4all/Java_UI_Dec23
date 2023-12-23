package Loops;

import java.util.Scanner;

public class LoopQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
    }
}
