package DöngülerKoşullar;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int birthYear;
        String zodiac;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        birthYear = input.nextInt();

        if(birthYear % 12 == 0) {
            zodiac = "Maymun";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        }else if(birthYear % 12 == 1) {
            zodiac = "Horoz";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        } else if(birthYear % 12 == 2) {
            zodiac = "Köpek";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        } else if(birthYear % 12 == 3) {
            zodiac = "Domuz";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        } else if(birthYear % 12 == 4) {
            zodiac = "Fare";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        } else if(birthYear % 12 == 5) {
            zodiac = "Öküz";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        } else if(birthYear % 12 == 6) {
            zodiac = "Kaplan";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        } else if(birthYear % 12 == 7) {
            zodiac = "Tavşan";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        } else if(birthYear % 12 == 8) {
            zodiac = "Ejderha";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        }else if(birthYear % 12 == 9) {
            zodiac = "Yılan";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        } else if(birthYear % 12 == 10) {
            zodiac = "At";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        } else if(birthYear % 12 == 11) {
            zodiac = "Koyun";
            System.out.println("Çin Zodyağı Burcunuz: " + zodiac);
        }
        else {
            System.out.println("Hatalı veri girdiniz.");
        }




    }
}
