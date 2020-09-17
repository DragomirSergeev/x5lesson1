package ru.x5.hw05.task2.computer.hardware.graphic;

import ru.x5.hw05.task2.computer.Computer;
import ru.x5.hw05.task2.computer.hardware.Producers;
import ru.x5.hw05.task2.computer.hardware.ram.RAMType;

public class IntelGraphicStrategy implements GraphicsStrategy {
    @Override
    public void addCard(Computer computer) {
        Graphics graphics = new Graphics(Producers.INTEL);
        graphics.setCoolingType(CoolingType.ACTIVE);
        graphics.setRamType(RAMType.DDR3);
        graphics.setRamValue(4048);
        computer.setGraphics(graphics);
    }
}
