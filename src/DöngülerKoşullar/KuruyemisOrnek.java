package DöngülerKoşullar;

import java.util.Scanner;

public class KuruyemisOrnek {
    public static void main(String[] args) {
        double leblebi = 3.5, findik = 15.7, badem = 22, sonPara;
        int kira = 500;

        double maliyet = (12 * leblebi) + (25 * findik) + (40 * badem);

        double kazanc = ((12 * leblebi) * 1.5) + ((25 * findik) * 1.4) + ((40 * badem) * 1.6);

        System.out.println(kazanc);
        System.out.println(maliyet);

        if(kazanc > 500) {
            sonPara = kazanc - (kira + maliyet);
            System.out.println("Kiranız ödenmiştir (-500TL)");
            System.out.println("Geriye kalan paranız: " + sonPara + "TL");
        } else {
            sonPara = kazanc - maliyet;
            System.out.println("Kiraya para kalmamıştır.");
            System.out.println("Geriye kalan paranız: " + sonPara + "TL");
        }


    }
}
