package ru.x5.hw05.task2.computer;

import ru.x5.hw05.task2.computer.hardware.Monitor;
import ru.x5.hw05.task2.computer.hardware.processor.Processor;
import ru.x5.hw05.task2.computer.hardware.graphic.Graphics;
import ru.x5.hw05.task2.computer.hardware.hdd.HDD;
import ru.x5.hw05.task2.computer.hardware.ram.RAM;

public class Computer {
    private Processor processor;
    private Graphics graphics;
    private HDD hdd;
    private Monitor monitor;
    private RAM ram;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor.getProducer() + " " + processor.getName() + " " + processor.getMHz() + " " +
                ", graphics=" + graphics + " " + graphics.getRamValue() + " " + graphics.getCoolingType() + " " +
                ", hdd=" + hdd + " " + hdd.getType() + " " +
                ", monitor=" + monitor + " " + monitor.getProducer() + " " +
                ", ram=" + ram +
                '}';
    }
}
