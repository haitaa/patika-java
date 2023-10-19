package DöngülerKoşullar;

import java.util.Scanner;

public class SayininUssunuHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam=1, us;

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        System.out.print("Sayının üssünü giriniz: ");
        us = input.nextInt();

        for(int i = 1; i <= us; i++) {
            toplam *= sayi;
        }
        System.out.println("Girilen sayının üssü: "+ toplam);
    }
}
