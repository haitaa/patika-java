package Metotlar;

public class Overloading {
    static void sum() {
        System.out.println("Parametresiz metot");
    }

    static void sum(int a) {
        System.out.println("Parametreler: " + a);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        sum();
        sum(1);
        int result1 = sum(2, 3);
        int result2 = sum(2, 3, 4);

        System.out.println(result1);
        System.out.println(result2);
    }
}
