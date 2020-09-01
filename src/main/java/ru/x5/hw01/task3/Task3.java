package ru.x5.hw01.task3;

import ru.x5.hw01.NumberReader;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int res = NumberReader.readCorrectInt();
        if (res > 0) {
            System.out.println(res + 1);
        } else {
            System.out.println(res);
        }

    }
}
