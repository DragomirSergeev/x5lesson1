package ru.x5.hw03.task2;

public class Horse extends Animal {
    private int horseshoeCount;


    @Override
    protected void makeNoise() {
        System.out.println("Лошадь спит.");
    }

    public int getHorseshoeCount() {
        return horseshoeCount;
    }

    public void setHorseshoeCount(int horseshoeCount) {
        this.horseshoeCount = horseshoeCount;
    }
}
