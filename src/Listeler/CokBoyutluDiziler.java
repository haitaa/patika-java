package Listeler;

public class CokBoyutluDiziler {
    public static void main(String[] args) {
        int[][] matris = new int[3][4];
        // matris[0][1], [0][n]...
        int number = 1;
        System.out.println(matris[0].length); // 4
        System.out.println(matris.length); // 3

        for(int i = 0; i < matris.length; i++) {
            for(int j = 0; j < matris[i].length; j++) {
                matris[i][j] = number++;
            }
        }

        for(int i = 0; i < matris.length; i++) {
            for(int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }




    }
}
