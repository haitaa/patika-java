package Metotlar;

public class Return_Void_Tanimi {
    /*
    static int sum(int a, int b) {
        return a + b;
    }
     */

    static void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
    public static void main(String[] args) {
        sum(5, 2);
    }
}
