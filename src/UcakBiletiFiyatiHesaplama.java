import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int km, age, tip;
        double mesafeUcreti = 0.10;
        double normalTutar, yasIndirimi, indirimliTutar, gidisDonusIndirimi, toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        tip = input.nextInt();

        if(km < 0 && age < 0 && (tip == 1) || (tip == 2)) {
            System.out.println("hatalı veri girdiniz.");
        } else {
            switch(tip) {
                case 1:
                    if(age < 12 && age > 0) {
                        normalTutar = km * mesafeUcreti;
                        yasIndirimi = normalTutar * 0.50;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gidisDonusIndirimi = indirimliTutar * 0.20;
                        toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
                        System.out.println("Toplam tutar: " + toplam + "TL");
                    } else if (age > 12 && age < 24) {
                        normalTutar = km * mesafeUcreti;
                        yasIndirimi = normalTutar * 0.10;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gidisDonusIndirimi = indirimliTutar * 0.20;
                        toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
                        System.out.println("Toplam tutar: " + toplam + "TL");
                    } else if(age > 65) {
                        normalTutar = km * mesafeUcreti;
                        yasIndirimi = normalTutar * 0.30;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gidisDonusIndirimi = indirimliTutar * 0.20;
                        toplam = (indirimliTutar - gidisDonusIndirimi) * 2;
                        System.out.println("Toplam tutar: " + toplam + "TL");
                    }
                case 2:
                    if(age < 12 && age > 0) {
                        normalTutar = km * mesafeUcreti;
                        yasIndirimi = normalTutar * 0.50;
                        toplam = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar: " + toplam + "TL");
                    } else if (age > 12 && age < 24) {
                        normalTutar = km * mesafeUcreti;
                        yasIndirimi = normalTutar * 0.10;
                        toplam = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar: " + toplam + "TL");
                    } else if(age > 65) {
                        normalTutar = km * mesafeUcreti;
                        yasIndirimi = normalTutar * 0.30;
                        toplam = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar: " + toplam + "TL");
                    }

            }
        }


    }
}
