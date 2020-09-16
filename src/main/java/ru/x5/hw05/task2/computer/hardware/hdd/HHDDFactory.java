package ru.x5.hw05.task2.computer.hardware.hdd;

public class HHDDFactory extends HDDfactory{
    @Override
    public HDD createHDD() {
        return new HHDD();
    }
}
