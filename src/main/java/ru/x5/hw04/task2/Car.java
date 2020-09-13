package ru.x5.hw04.task2;

public abstract class Car {
    protected String mark;
    protected String classAuto;
    protected double weight;
    protected Engine engine;

    abstract void start();

    abstract void stop();

    void turnRight() {
        System.out.println("Поворот направо");
    }

    void turnLeft() {
        System.out.println("Поворот налево");
    }

    abstract void printInfo();
}