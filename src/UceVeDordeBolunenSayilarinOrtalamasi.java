import java.util.Scanner;

public class UceVeDordeBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0, dongu = 0;

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for(int i = 0; i < sayi; i++) {
            if(i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                toplam += i;
                dongu++;
            }
        }

        int average = toplam / dongu;
        System.out.println("Girilen sayıların ortalaması: " + average + ".");

    }
}
