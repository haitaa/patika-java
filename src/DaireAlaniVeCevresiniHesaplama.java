import java.util.Scanner;

public class DaireAlaniVeCevresiniHesaplama {
    public static void main(String[] args) {
        double pi = 3.14, r, alan, cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        r = input.nextDouble();

        alan = pi * Math.sqrt(r);
        System.out.println("Alan: " + alan);

        cevre = (2 * pi) * r;
        System.out.println("Çevre: " + cevre);

        // Ödev

        double a = 3;
        double daire_alani = (pi * (Math.sqrt(r)) * a) / 360;
        System.out.println("Daire Alanı: " + daire_alani);

    }
}
