package ru.x5.hw05.task2.computer.hardware.processor;

import ru.x5.hw05.task2.computer.Computer;

public class GameProcessorStrategy implements ProcessorStrategy{
    @Override
    public void getProcessor(Computer computer) {
        computer.setProcessor(new GameProcessor(100));
    }
}
