package ru.x5.hw04.task2;

public class Lorry extends Car {

    private int carrying;


    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
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
