package DöngülerKoşullar;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        double kdv = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.print("Para değerinizi giriniz: ");
        double deger = input.nextDouble();

        double ustLimitKontrol = deger > 0 ? kdv = 0.08 : kdv;

        double kdvTutar = (deger * kdv) + deger;

        System.out.println("KDV'siz fiyatınız: " + deger);
        System.out.println("KDV'li fiyatınız: " + kdvTutar);
        System.out.println("KDV Tutarı: " + (kdv * 100));
    }
}
