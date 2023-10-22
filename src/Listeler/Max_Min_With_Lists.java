package Listeler;

import java.util.Arrays;
public class Max_Min_With_Lists {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for(int i: list) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }

        System.out.println("Minimum Değer: " + min);
        System.out.println("Maksimum Değer: " + max);


        // Ödev
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(dizi);
        int girilenSayi = 5;
        int max1 = 0;
        int min1 = 0;

        for(int i: dizi) {
            if(girilenSayi < i) {
                max1 = i;
                break;
            }}

        for(int i: dizi) {
            if(girilenSayi > i) {
                min1 = i;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.println("Girilen Sayı: " + girilenSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min1);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max1);



    }
}
