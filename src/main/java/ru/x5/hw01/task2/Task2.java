package ru.x5.hw01.task2;

import ru.x5.hw01.NumberReader;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String entered = NumberReader.readCorrectString(3);
        int result = 0;
        for (int i = 0; i < entered.length(); i++) {
            result += Integer.parseInt(entered.substring(i, i + 1));
        }
        System.out.println(result);

    }
}
