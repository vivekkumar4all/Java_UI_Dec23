package Patterns;

public class HollowSq {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            // *****
            for (int col = 1; col <= 5; col++) {
                if (row == 1 || row == 5 || col == 1 || col == 5) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            //to shift curso into the next line
            System.out.println();
        }
    }
}
