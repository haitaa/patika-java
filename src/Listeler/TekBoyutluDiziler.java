package Listeler;

public class TekBoyutluDiziler {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        numbers[4] = 30;

        System.out.println(numbers[3]); // 25

        String[] weekDays = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};

        // Dizinin Kapasitesini Öğrenme
        int[] numbers1 = new int[100];
        System.out.println(numbers1.length); // 100

        // Dizinin bir elemanını değiştirme
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        cars[2] = "Toyota";
        System.out.println(cars[0]); // Opel
    }
}
