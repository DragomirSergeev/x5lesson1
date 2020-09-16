package ru.x5.hw05.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(LoggersType.CONSOLE);
        calculator.calculate("1+2");
        Calculator calculator1 = new Calculator(LoggersType.FILE);
        calculator1.calculate("4-2");
    }
}
