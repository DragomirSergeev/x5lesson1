package ru.x5.hw04.task2;

public class Engine {
    private int poser;
    private int efficiency;

    public Engine() {
        this(10,11);
    }

    public Engine(int poser, int efficiency) {
        this.poser = poser;
        this.efficiency = efficiency;
    }

    public int getPoser() {
        return poser;
    }

    public void setPoser(int poser) {
        this.poser = poser;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
}
