package Metotlar;

public class Recursive {

    static int f(int n) {
        System.out.println(n);
        if(n == 1) {
            return 1;
        }
        return f(n-1) + n;
    }
    public static void main(String[] args) {
        f(10);
    }
}
