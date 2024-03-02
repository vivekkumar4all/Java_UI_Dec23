import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner laptop = new Scanner(System.in);
        System.out.println("Enter the first numer");
        int num1 = laptop.nextInt();
        System.out.println("Enter the second number");
        int num2 = laptop.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        System.out.println("This is the sum :" + sum);
    }
}




//solve all the ques using scanner

//find the sum, sub, mul and division
//ask the student its name and his marks in 3 subject
//ask employee his name and his salary and calcualte the HRA(20%). House Rent Allowance
