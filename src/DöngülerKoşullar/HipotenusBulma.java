package DöngülerKoşullar;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
    int a, b, c;
    double u, alan;
    Scanner input = new Scanner(System.in);

    System.out.print("A sayısını giriniz: ");
    a = input.nextInt();

    System.out.print("B sayısını giriniz: ");
    b = input.nextInt();

    System.out.print("C sayısını giriniz: ");
    c = input.nextInt();

    u = (double) (a + b + c) / 2;
    System.out.println("Üçgenin çevresi: " + (2 * u));

    alan = u * (u - a) * (u - b) * (u - c);
    System.out.println("Üçgenin alanı: " + alan);

    /*
    c = Math.sqrt((a * a) + (b * b));
    System.out.println("Hipotenüs: " + c);
    */


    }
}
