package ru.x5.hw05.task2.computer.hardware.ram;

import ru.x5.hw05.task2.computer.hardware.Producers;

public class RAM implements RamInterface{
    private Producers producer;
    private long value;
    private long Hz;
    private RAMType type;

    @Override
    public void checkRam() {

    }

    public Producers getProducer() {
        return producer;
    }

    public void setProducer(Producers producer) {
        this.producer = producer;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getHz() {
        return Hz;
    }

    public void setHz(long hz) {
        Hz = hz;
    }

    public RAMType getType() {
        return type;
    }

    public void setType(RAMType type) {
        this.type = type;
    }
}
