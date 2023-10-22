package Listeler;

public class Dizideki_Elemanlarin_Ortalamasi {
    public static void main(String[] args) {
        int[] list = {3, 4, 5, 6};
        int toplam = 0;
        for(int i=0; i<list.length; i++) {
            toplam += list[i];
        }

        double average = toplam / list.length;
        System.out.println(average);
    }
}
