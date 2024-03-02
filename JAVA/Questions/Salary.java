package Questions;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner abcd = new Scanner(System.in);
        System.out.println("What is your salary??");
        int salary = abcd.nextInt();

        int hra = (int) (0.3 * salary);
        System.out.println("this is the HRA :" + hra);
    }
}
