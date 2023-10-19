package DöngülerKoşullar;

import java.util.Scanner;

public class VucutKitleIndeksiBulma {
    public static void main(String[] args) {
        double kilo, boy, bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lüttfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        bmi = kilo / Math.sqrt(boy);
        System.out.println("Vücüt Kitle İndeksiniz: " + bmi);

    }
}
