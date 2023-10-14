import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int num1, num2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
        }
    }
}
