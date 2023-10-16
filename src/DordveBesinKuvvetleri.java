import java.util.Scanner;

public class DordveBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        System.out.println("Sayıların 4 kuvvetleri...");
        for(int i = 1; i <= sayi; i*=4) {
            if(i == 1) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("----------------");
        System.out.println("Sayıların 5 kuvvetleri...");
        for(int i = 1; i <= sayi; i*=5) {
            if(i == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
