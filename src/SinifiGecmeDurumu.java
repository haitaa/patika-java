import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, kimya, türkçe, müzik, invalidLesson=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik not ortalaması: ");
        matematik = input.nextInt();

        System.out.print("Fizik not ortalaması: ");
        fizik = input.nextInt();

        System.out.print("Kimya not ortalaması: ");
        kimya = input.nextInt();

        System.out.print("Türkçe not ortalaması: ");
        türkçe = input.nextInt();

        System.out.print("Müzik not ortalaması: ");
        müzik = input.nextInt();

        if((matematik < 0) || (matematik > 100)) {
            matematik = 0;
            invalidLesson++;
        }

        if((fizik < 0) || (fizik > 100)) {
            fizik = 0;
            invalidLesson++;
        }

        if((kimya < 0) || (kimya > 100)) {
            kimya = 0;
            invalidLesson++;
        }

        if((türkçe < 0) || (türkçe > 100)) {
            türkçe = 0;
            invalidLesson++;
        }

        if((müzik < 0) || (müzik > 100)) {
            müzik = 0;
            invalidLesson++;
        }

        System.out.println(invalidLesson);

        double ortalama = (double) (matematik + fizik + kimya + türkçe + müzik) / invalidLesson;
        if(ortalama <= 55) {
            System.out.println("Sınıfta kaldınız.");
            System.out.println("Ortalamanız: " + ortalama);
        } else {
            System.out.println("Sınıfı geçtiniz.");
            System.out.println("Ortalamanız: " + ortalama);
        }
    }
}
