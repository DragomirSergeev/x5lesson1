package ru.x5.hw05.task2.computer.hardware.hdd;

public class SSD extends HDD implements HDDinterface {
    @Override
    public void readNwrite() {
        System.out.println("quiq rw");
    }
}
