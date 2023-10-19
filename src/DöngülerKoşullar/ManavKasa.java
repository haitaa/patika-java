package DöngülerKoşullar;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, toplam = 0;
        int kilo;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? :");
        kilo = input.nextInt();
        toplam += armut * kilo;

        System.out.print("Elma kaç kilo? :");
        kilo = input.nextInt();
        toplam += elma * kilo;

        System.out.print("Domates kaç kilo? :");
        kilo = input.nextInt();
        toplam += domates * kilo;

        System.out.print("Muz kaç kilo? :");
        kilo = input.nextInt();
        toplam += muz * kilo;

        System.out.print("Patlıcan kaç kilo? :");
        kilo = input.nextInt();
        toplam += patlican * kilo;

        System.out.println("Toplam tutar: " + toplam + "TL");
    }
}
