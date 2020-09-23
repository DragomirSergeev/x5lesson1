package ru.x5.hw04.task2;

public class Main {
    public static void main(String[] args) {
        Car sport = new SportCar();
        sport.setMark("Cadillac");
        ((SportCar)sport).setMaxSpeed(280);
        sport.setClassAuto("SPORT");
        sport.setEngine(new Engine());
        sport.printInfo();
    }
}
