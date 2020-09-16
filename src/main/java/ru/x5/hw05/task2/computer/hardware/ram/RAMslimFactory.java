package ru.x5.hw05.task2.computer.hardware.ram;

import ru.x5.hw05.task2.computer.hardware.Producers;

public class RAMslimFactory extends RAMFactory{
    @Override
    public RAM getRam() {
        RAM ram = new RAMslim();
        ram.setProducer(Producers.INTEL);
        return ram;
    }
}
