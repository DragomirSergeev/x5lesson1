package ru.x5.hw05.task2.computer.hardware.graphic;

import ru.x5.hw05.task2.computer.Computer;
import ru.x5.hw05.task2.computer.hardware.Producers;
import ru.x5.hw05.task2.computer.hardware.ram.RAMType;

public class AMDGraphicStrategy implements GraphicsStrategy {

    @Override
    public void addCard(Computer computer) {
        Graphics graphics = new Graphics(Producers.AMD);
        graphics.setCoolingType(CoolingType.PASSIVE);
        graphics.setRamType(RAMType.DDR3);
        graphics.setRamValue(2024);
        computer.setGraphics(graphics);
    }
}
