import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner abcd = new Scanner(System.in);
        System.out.println("Enter your name :");
        String xyz = abcd.nextLine();
        System.out.println("this is the input from the user :" + xyz);
    }
}
