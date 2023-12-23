package Conditional;

import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Employee");
        String empName = scanner.nextLine();
        System.out.println("Enter your salary");
        int salary = scanner.nextInt();

        double hra = 0.2 * salary;
        float hra1 = (float) (0.2 * salary);

        int hra2 = (int) (0.2 * salary);

        System.out.println("Your HRA is (dou):" + hra);
        System.out.println("Your HRA is (flo) :" + hra1);

        System.out.println("Your HRA is (int) :" + hra2);

    }
}
