package Siniflar;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi Q8";
        audi.speed = 120;
        audi.increaseSpeed(30);
        System.out.println(audi.model + " Hızı: " + audi.speed);

        Car bmw = new Car();
        bmw.model = "BMW M8";
        bmw.speed = 140;
        bmw.increaseSpeed(40);
        System.out.println(bmw.model + " Hızı: " + bmw.speed);

        Car mercedes = new Car();
        mercedes.model = "Mercedes G63";
        mercedes.speed = 130;
        mercedes.increaseSpeed(40);
        System.out.println(mercedes.model + " Hızı: " + mercedes.speed);

    }
}
