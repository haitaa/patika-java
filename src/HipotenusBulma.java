import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
    int a, b;
    double c;
    Scanner input = new Scanner(System.in);

    System.out.print("A sayısını giriniz: ");
    a = input.nextInt();

    System.out.print("B sayısını giriniz: ");
    b = input.nextInt();

    c = Math.sqrt((a * a) + (b * b));
    System.out.println("Hipotenüs: " + c);


    }
}
