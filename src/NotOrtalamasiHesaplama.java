import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, türkçe, tarih, müzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik not ortalaması: ");
        matematik = input.nextInt();

        System.out.print("Fizik not ortalaması: ");
        fizik = input.nextInt();

        System.out.print("Kimya not ortalaması: ");
        kimya = input.nextInt();

        System.out.print("Türkçe not ortalaması: ");
        türkçe = input.nextInt();

        System.out.print("Tarih not ortalaması: ");
        tarih = input.nextInt();

        System.out.print("Müzik not ortalaması: ");
        müzik = input.nextInt();

        double sonuc = (matematik + fizik + kimya + türkçe + tarih + müzik) / 6;
        System.out.println("Ortalamanız: " + sonuc);

        String gecti = sonuc > 60 ? "Geçti" : "Kaldı";
        System.out.println(gecti);
    }
}
