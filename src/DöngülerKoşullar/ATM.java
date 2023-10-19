package DöngülerKoşullar;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String secenek, name, password;
        String islemSecenekleri = "* Bakiye Görüntüleme için --> 1" +
                "* Para çekmek için --> 2" +
                "* Farklı hesaba para yatırmak için --> 3" +
                "* Uygulamadan çıkmak için 'q' tuşuna basınız.";

        double mustafaBakiye = 2450;
        String mustafaIban = "TR1265 2372 872 362 6237 12 37";
        String mustafaKullanici = "mustafa123";
        String mustafaSifre = "123";

        double canBakiye = 1200;
        String canIban = "TR1265 2372 872 362 6237 12 38";
        String canKullanici = "can123";
        String canSifre = "456";

        System.out.println("Giriş ekranına hoş geldiniz.");
        System.out.print("Isminiz: ");
        name = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(name.equals(mustafaKullanici) && password.equals(mustafaSifre)) {
            System.out.println("Mustafa Bey Hoşgeldiniz.");
            System.out.println(islemSecenekleri);
            boolean aktif = true;


            while(aktif) {
                System.out.print("Bir seçenek giriniz: ");
                secenek = input.nextLine();

                switch(secenek) {
                    case "1":
                        System.out.println("Hesap bakiyeniz: " + mustafaBakiye + "TL");
                        break;
                    case "2":
                        System.out.println("Para çekme ekranına hoş geldiniz. Bakiyeniz: " + mustafaBakiye + "TL");
                        System.out.print("Kaç tl çekmek istiyorsunuz? :");
                        double cekilecekPara = input.nextDouble();

                        if(cekilecekPara < mustafaBakiye) {
                            mustafaBakiye -= cekilecekPara;
                            System.out.println(cekilecekPara + "TL başarıyla çekilmiştir.");
                            System.out.println("Güncel bakiye: " + mustafaBakiye + "TL.");
                        } else {
                            System.out.println("Girdiğiniz miktar, bakiye miktarını aşmaktadır.");
                        }
                        break;
                    case "3":
                        System.out.println("Farklı bir hesaba para yatırma sayfasına hoş geldiniz. Bakiyeniz: " + mustafaBakiye + "TL");
                        System.out.print("Göndermek istediğiniz kişinin IBAN'ını giriniz: ");
                        String iban = input.nextLine();
                        if(iban.equals(canIban)) {
                            System.out.print("Can kullanıcısına kaç TL göndermek istiyorsunuz? :");
                            double gonderilecekMiktar = input.nextDouble();
                            if(gonderilecekMiktar < mustafaBakiye) {
                                mustafaBakiye -= gonderilecekMiktar;
                                canBakiye += gonderilecekMiktar;
                                System.out.println("Başarıyla para gönderilmiştir. Bakiyeniz: " + mustafaBakiye + "TL");
                            } else {
                                System.out.println("Girdiğiniz miktar, bakiye miktarını aşmaktadır.");
                            }
                        } else {
                            System.out.println("Girdiğiniz IBAN sistemde hiçbir kullanıcı ile eşleşmiyor.");
                        }
                        break;
                    case "q":
                        aktif = false;
                        System.out.println("Başarıyla çıkış yapılmıştır.");
                        break;
                }
            }
        } else if(name.equals(canKullanici) && password.equals(canSifre)) {
            System.out.println("Can Bey Hoşgeldiniz.");
            System.out.println(islemSecenekleri);
            boolean aktif = true;


            while(aktif) {
                System.out.print("Bir seçenek giriniz: ");
                secenek = input.nextLine();

                switch(secenek) {
                    case "1":
                        System.out.println("Hesap bakiyeniz: " + canBakiye + "TL");
                        break;
                    case "2":
                        System.out.println("Para çekme ekranına hoş geldiniz. Bakiyeniz: " + canBakiye + "TL");
                        System.out.print("Kaç tl çekmek istiyorsunuz? :");
                        double cekilecekPara = input.nextDouble();

                        if(cekilecekPara < canBakiye) {
                            canBakiye -= cekilecekPara;
                            System.out.println(cekilecekPara + "TL başarıyla çekilmiştir.");
                            System.out.println("Güncel bakiye: " + canBakiye + "TL.");
                        } else {
                            System.out.println("Girdiğiniz miktar, bakiye miktarını aşmaktadır.");
                        }
                        break;
                    case "3":
                        System.out.println("Farklı bir hesaba para yatırma sayfasına hoş geldiniz. Bakiyeniz: " + canBakiye + "TL");
                        System.out.print("Göndermek istediğiniz kişinin IBAN'ını giriniz: ");
                        String iban = input.nextLine();
                        if(iban.equals(mustafaIban)) {
                            System.out.print("Mustafa kullanıcısına kaç TL göndermek istiyorsunuz? :");
                            double gonderilecekMiktar = input.nextDouble();
                            if(gonderilecekMiktar < canBakiye) {
                                canBakiye -= gonderilecekMiktar;
                                mustafaBakiye += gonderilecekMiktar;
                                System.out.println("Başarıyla para gönderilmiştir. Bakiyeniz: " + canBakiye + "TL");
                            } else {
                                System.out.println("Girdiğiniz miktar, bakiye miktarını aşmaktadır.");
                            }
                        } else {
                            System.out.println("Girdiğiniz IBAN sistemde hiçbir kullanıcı ile eşleşmiyor.");
                        }
                        break;
                    case "q":
                        aktif = false;
                        System.out.println("Başarıyla çıkış yapılmıştır.");
                        break;
                }
            }
        } else {
            System.out.println("Hatalı bir giriş yaptınız.");
        }
    }
}
