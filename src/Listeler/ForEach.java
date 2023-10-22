package Listeler;

public class ForEach {
    public static void main(String[] args) {
        String[] arabalar = {"BMW", "Mercedes", "Ford", "Ferrari"};

        for(String i:arabalar) {
            System.out.println(i);
        }

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for(int[] a : matris) {
            for(int elem: a) {
                System.out.println(elem);
            }
        }
    }
}
