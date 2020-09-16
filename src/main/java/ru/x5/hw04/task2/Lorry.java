package ru.x5.hw04.task2;

public class Lorry extends Car {

    private int carrying;


    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void printInfo() {
        System.out.println("Марка: " + mark + "\n" +
                "Класс: " + classAuto + "\n" +
                "Вес: " + weight + "\n" +
                "Грузоподъемность: " + carrying + "\n" +
                "Двигатель: (мощность - " + engine.getPoser() + ", производительность - " + engine.getEfficiency());
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
