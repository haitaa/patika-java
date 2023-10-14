import java.util.Scanner;

public class GirisYapma {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        username = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(username.equals("haita") && password.equals("java123")) {
            System.out.println("Giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz Yanlış");
            String onay;

            System.out.print("Şifreyi sıfırlamak ister misiniz? ");
            onay = input.nextLine();

            if(onay.equals("evet")) {
                String yeniSifre;
                System.out.print("Yeni şifrenizi giriniz: ");
                yeniSifre = input.nextLine();

                if (yeniSifre.equals(password)) {
                    System.out.println("Şifre Oluşturulamadı, Lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre Oluşturuldu.");
                }
            } else {
                System.out.println("Sistemden çıkış yapıldı.");
            }
        }
    }
}
