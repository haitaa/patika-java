package Metotlar;

import java.util.Scanner;
public class PalindromSayi {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if(number == reverseNumber) {
            System.out.println(number + " palindromik bir sayıdır.");
            return true;
        } else {
            System.out.println(number + " palindromik bir sayı değildir.");
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();
        isPalindrom(sayi);
    }
}
