package ru.x5.hw05.task2.computer.hardware.graphic;

import ru.x5.hw05.task2.computer.hardware.Producers;
import ru.x5.hw05.task2.computer.hardware.ram.RAMType;

public class Graphics {
    private Producers producer;
    private RAMType ramType;
    private long ramValue;
    private CoolingType coolingType;

    public Graphics(Producers producer) {
        this.producer = producer;
    }

    public Producers getProducer() {
        return producer;
    }

    public void setProducer(Producers producer) {
        this.producer = producer;
    }

    public RAMType getRamType() {
        return ramType;
    }

    public void setRamType(RAMType ramType) {
        this.ramType = ramType;
    }

    public long getRamValue() {
        return ramValue;
    }

    public void setRamValue(long ramValue) {
        this.ramValue = ramValue;
    }

    public CoolingType getCoolingType() {
        return coolingType;
    }

    public void setCoolingType(CoolingType coolingType) {
        this.coolingType = coolingType;
    }
}
