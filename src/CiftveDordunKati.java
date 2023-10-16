import java.util.Scanner;

public class CiftveDordunKati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean devam = true;
        int toplam = 0;

        while(devam) {
            System.out.print("Bir sayı giriniz: ");
            int sayi = input.nextInt();

            if(sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            } else {
                System.out.println("Girdiğiniz sayıların toplamı: " + toplam);
                System.out.println("Tek sayı girdiniz. Çıkış yapıldı.");
                break;
            }
        }

    }
}
