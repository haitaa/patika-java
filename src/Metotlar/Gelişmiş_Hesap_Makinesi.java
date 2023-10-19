package Metotlar;

import java.util.Scanner;

public class Gelişmiş_Hesap_Makinesi {
    static double toplama(int a, int b) {
        double result = (double) a + b;
        return result;
    }

    static double cikarma(int a, int b) {
        double result = (double) a - b;
        return result;
    }

    static double carpma(int a, int b) {
        double result = (double) a * b;
        return result;
    }

    static double bolme(int a, int b) {
        double result = (double) a / b;
        return result;
    }

    static double usluHesaplama(int base, int exp) {
        double result = Math.pow(base, exp);
        return result;
    }

    static int faktoriyelHesaplama(int a) {
        int toplam = 1;
        for(int i = 1; i <= a; i++) {
            toplam *= i;
        }
        return toplam;
    }

    static int modAlma(int a, int b) {
        int result = a % b;
        return result;
    }

    static void alanveCevreHesaplama(int a, int b) {
        double alan = a * b;
        double cevre = (a+b) * 2;

        System.out.println("Dikdörtgenin alanı: " + alan);
        System.out.println("Dikdörtgenin çevresi: " + cevre);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;

        String secimEkrani = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan ve Çevre Hesabı\n" +
                "9-Çıkış yapmak.";

        boolean devam = true;

        while(devam) {
            System.out.println("------------------------------------");
            System.out.println(secimEkrani);
            System.out.print("Bir seçim yapınız: ");
            secim = input.nextInt();

            if(secim >= 1 && secim <=4) {
                System.out.print("1. sayıyı giriniz: ");
                int sayi1 = input.nextInt();
                System.out.print("2. sayıyı giriniz: ");
                int sayi2 = input.nextInt();

                switch(secim) {
                    case 1:
                        System.out.println("Toplama İşlemi");
                        double sonuc = toplama(sayi1, sayi2);
                        System.out.println("Sonuç: " + sonuc);
                        break;
                    case 2:
                        System.out.println("Çıkarma İşlemi");
                        double sonuc1 = cikarma(sayi1, sayi2);
                        System.out.println("Sonuç: " + sonuc1);
                        break;
                    case 3:
                        System.out.println("Çarpma İşlemi");
                        double sonuc2 = carpma(sayi1, sayi2);
                        System.out.println("Sonuç: " + sonuc2);
                        break;
                    case 4:
                        System.out.println("Bölme İşlemi");
                        double sonuc3 = bolme(sayi1, sayi2);
                        System.out.println("Sonuç: " + sonuc3);
                        break;
                }
            }

            switch(secim) {
                case 5:
                    System.out.println("Üslü Sayı İşlemi");
                    System.out.print("Taban sayısını giriniz: ");
                    int taban = input.nextInt();
                    System.out.print("Üs sayısını giriniz: ");
                    int us = input.nextInt();

                    double sonuc = usluHesaplama(taban, us);
                    System.out.println("Sonuç: "+ sonuc);
                    break;
                case 6:
                    System.out.println("Faktöriyel İşlemi");
                    System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz: ");
                    int sayi = input.nextInt();

                    int sonuc1 = faktoriyelHesaplama(sayi);
                    System.out.println("Sonuç: " + sonuc1);
                    break;
                case 7:
                    System.out.println("Mod Alma İşlemi");
                    System.out.print("Modu alınacak sayıyı giriniz: ");
                    int ilkSayi = input.nextInt();
                    System.out.print("Bölecek olan sayıyı giriniz: ");
                    int ikinciSayi = input.nextInt();

                    int sonuc2 = modAlma(ilkSayi, ikinciSayi);
                    System.out.println("Sonuç: " + sonuc2);
                    break;
                case 8:
                    System.out.println("Dikdörtgenin Çevresi ve Alanını Hesaplama İşlemi");
                    System.out.print("1. kenar uzunluğunu giriniz: ");
                    int kenarUzunlugu = input.nextInt();
                    System.out.print("2. kenar uzunluğunu giriniz: ");
                    int kenarUzunlugu2 = input.nextInt();

                    alanveCevreHesaplama(kenarUzunlugu, kenarUzunlugu2);
                    break;
                case 9:
                    System.out.println("Başarıyla çıkış yapılmıştır.");
                    devam = false;
                    break;
            }
        }



    }
}
