package Listeler;

public class HarmonikSayilar {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        double toplam = 0;

        for(int i: list) {
            toplam += 1.0 / i;
        }

        double harmonikOrtalama = list.length / toplam;
        System.out.println("Harmonik Ortalaması: " + harmonikOrtalama);
    }
}
