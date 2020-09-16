package ru.x5.hw05.task2.computer.hardware.graphic;

import ru.x5.hw05.task2.computer.Computer;

public class GraphicsInstaller {
    Computer computer;

    public GraphicsInstaller(Computer computer) {
        this.computer = computer;
    }

    public void save(GraphicsStrategy graphicsStrategy){
        graphicsStrategy.addCard(computer);
    }
}
