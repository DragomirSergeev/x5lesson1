package ru.x5.hw05.task2.computer.hardware.processor;

import ru.x5.hw05.task2.computer.hardware.Producers;

public class Processor {
    private int MHz;
    private int coresCount;
    private int cacheM;
    private String name;
    private Producers producer;

    public int getMHz() {
        return MHz;
    }

    public void setMHz(int MHz) {
        this.MHz = MHz;
    }

    public int getCoresCount() {
        return coresCount;
    }

    public void setCoresCount(int coresCount) {
        this.coresCount = coresCount;
    }

    public int getCacheM() {
        return cacheM;
    }

    public void setCacheM(int cacheM) {
        this.cacheM = cacheM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Producers getProducer() {
        return producer;
    }

    public void setProducer(Producers producer) {
        this.producer = producer;
    }
}
