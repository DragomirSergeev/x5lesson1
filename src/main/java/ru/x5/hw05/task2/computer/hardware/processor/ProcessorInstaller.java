package ru.x5.hw05.task2.computer.hardware.processor;

import ru.x5.hw05.task2.computer.Computer;

public class ProcessorInstaller {
    Computer computer;

    public ProcessorInstaller(Computer computer) {
        this.computer = computer;
    }

    public void save(ProcessorStrategy processorStrategy){
        processorStrategy.getProcessor(computer);;
    }
}
