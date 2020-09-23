package ru.x5.hw04.task2;

public class SportCar extends Car {

    private int maxSpeed;

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Марка: " + mark + "\n" +
                "Класс: " + classAuto + "\n" +
                "Вес: " + weight + "\n" +
                "Максимальная скорость: " + maxSpeed + "\n" +
                "Двигатель: (мощность - " + engine.getPoser() + ", производительность - " + engine.getEfficiency());
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
