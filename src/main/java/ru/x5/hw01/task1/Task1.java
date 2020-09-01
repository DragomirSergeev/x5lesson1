package ru.x5.hw01.task1;

import ru.x5.hw01.NumberReader;

public class Task1 {

    public static void main(String[] args) {
        String entered = NumberReader.readCorrectString();
        System.out.println(entered.substring(entered.length() - 1, entered.length()));
    }
}
