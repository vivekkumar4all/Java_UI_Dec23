package Tricks;

public class FinalFrenzy {

    public static void main(String[] args) {
        System.out.println(f(5));
    }   

    static int f(int n) {
        if (n == 0) {
            return 1;
        } else {
            return f(n - 1) * n;
        }
    }

}
