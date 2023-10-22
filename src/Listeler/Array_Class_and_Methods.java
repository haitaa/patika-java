package Listeler;

import java.util.Arrays;

public class Array_Class_and_Methods {
    public static void main(String[] args) {

        // Arrays.toString()
        // Diziye ait elemanları direkt ekrana basmak için kullanılan bir metottur.
        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(dizi)); // [3, 5, 79, 12, 25, -3, 66, 82, -49, 152]

        // Arrays.fill()
        // Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.
        Arrays.fill(dizi, 2);
        System.out.println(Arrays.toString(dizi)); // [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]

        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};
        Arrays.fill(liste2, 2, 5, 7);
        System.out.println(Arrays.toString(liste2)); // [15, 1, 7, 7, 7, -22, 11, 2, -49, 52]

        // Arrays.sort()
        // Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.
        int[] liste3 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(liste3);
        System.out.println(Arrays.toString(liste3)); // [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]

        // Arrays.binarySearch()
        // Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir. Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.
        int[] liste4 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(liste4);
        System.out.println(Arrays.toString(liste4));

        int index = Arrays.binarySearch(liste4, 33);
        System.out.println("33'ün indeksi: " + index); // 33'ün indeksi: 8

        // Arrays.copyOf() ve Arrays.copyOfRange() metotu
        // Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır.
        // Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.

        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(liste, 3);
        System.out.println(Arrays.toString(copyArray)); // [6, 1, 55]

        int[] copyOfRangeArray = Arrays.copyOfRange(liste, 0, 5);
        System.out.println(Arrays.toString(copyOfRangeArray)); // [6, 1, 55, 21, 33]

        // Arrays.equals metodu
        // Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.

        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {4, 5, 6};

        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list1, list3)); // false
    }
}
