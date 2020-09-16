package ru.x5.hw05.task2.computer.hardware.ram;

import ru.x5.hw05.task2.computer.hardware.Producers;

public class RAMServerFactory extends RAMFactory{
    @Override
    public RAM getRam() {
        RAM ram = new RAMServer();
        ram.setProducer(Producers.KINGSTONE);
        return ram;
    }
}
