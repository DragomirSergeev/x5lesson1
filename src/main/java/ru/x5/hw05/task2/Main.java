package ru.x5.hw05.task2;

import ru.x5.hw05.task2.computer.Computer;
import ru.x5.hw05.task2.computer.ComputerFacade;
import ru.x5.hw05.task2.computer.hardware.hdd.HDDType;
import ru.x5.hw05.task2.computer.hardware.ram.RAMType;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        Computer computer = computerFacade.createComputer(HDDType.SSD,1000, RAMType.DDR3);
        System.out.println(computer.toString());
    }
}
