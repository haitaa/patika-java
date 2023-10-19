package DöngülerKoşullar;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, kmBasiTutar = 2.20, minimumTutar = 20, acilisUcreti = 10;

        System.out.print("Gidilecek kilometre: ");
        km = input.nextDouble();

        double toplamTutar = (km * kmBasiTutar) + acilisUcreti;

        double ucretLimiti = toplamTutar < minimumTutar ? toplamTutar = 20 : toplamTutar;

        System.out.println("Toplam tutar: " + ucretLimiti);

    }
}
