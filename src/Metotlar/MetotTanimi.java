package Metotlar;

public class MetotTanimi {
    static void helloWorld() {
        System.out.println("Merhaba Dünya");
    }
    static int power(int base, int exp) {
        int result = (int) Math.pow(base, exp);
        return result;
    }
    public static void main(String[] args) {
        int result1 = power(2, 4);
        System.out.println(result1);
        helloWorld();
    }
}
