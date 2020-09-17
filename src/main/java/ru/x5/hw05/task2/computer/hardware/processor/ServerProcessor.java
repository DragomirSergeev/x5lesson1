package ru.x5.hw05.task2.computer.hardware.processor;

public class ServerProcessor extends Processor{
    int maxThreads;

    public ServerProcessor(int maxThreads) {
        this.maxThreads = maxThreads;
    }

    public int getMaxThreads() {
        return maxThreads;
    }

    public void setMaxThreads(int maxThreads) {
        this.maxThreads = maxThreads;
    }
}
