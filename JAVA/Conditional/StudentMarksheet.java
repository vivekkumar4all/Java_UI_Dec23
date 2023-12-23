package Conditional;

import java.util.Scanner;

public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String studentName = scanner.nextLine();
        System.out.println("Enter the Marks in Hindi");
        int hindiMarks = scanner.nextInt();
        System.out.println("Enter the marks in Maths");
        int mathsMarks = scanner.nextInt();
        System.out.println("Enter the marks in English");
        int englishMarks = scanner.nextInt();

        int avgMarks = (hindiMarks + mathsMarks + englishMarks) / 3;


        String engRemark = "You need to study more";
        if(englishMarks < 70){
            System.out.println(engRemark);
        }
        if (avgMarks > 90) {
            System.out.println("A Grade :" + avgMarks);
        } else if (avgMarks > 80 && avgMarks < 90) {
            System.out.println("B Grade :" + avgMarks);
        } else if (avgMarks > 70 && avgMarks < 80) {
            System.out.println("C Grade :" + avgMarks);
        } else if (avgMarks < 70) {
            System.out.println("D Grade :" + avgMarks);
        }
    }
}
