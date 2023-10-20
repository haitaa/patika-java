package Siniflar;

class Car {
    String type = "SUV";
    String model;
    String color = "black";
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increment) {
        if((speed + increment) < speedLimit)
            speed += increment;
    }

    void decreaseSpeed(int decrease) {
        if(speed > 0)
            speed -= decrease;
    }

    void printSpeed() {
        System.out.println("Hızınız: " + speed);
    }
}
