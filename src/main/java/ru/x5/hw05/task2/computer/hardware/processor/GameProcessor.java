package ru.x5.hw05.task2.computer.hardware.processor;

public class GameProcessor extends Processor {
    int maxTemperature;

    public GameProcessor(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
