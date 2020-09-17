package ru.x5.hw05.task2.computer.hardware;

public class Monitor {
    private String name;
    private Producers producer;

    public Monitor() {
        this("Defalt name");
    }
    public Monitor(String name) {
        this(name,Producers.INTEL);
    }
    public Monitor(String name,Producers producer) {

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
