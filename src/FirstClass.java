import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("İsminizi giriniz: ");
        String isim = input.nextLine();
        System.out.println(isim);

        System.out.print("A sayısını giriniz: ");
        a = input.nextInt();
        System.out.println(a);
    }
}
