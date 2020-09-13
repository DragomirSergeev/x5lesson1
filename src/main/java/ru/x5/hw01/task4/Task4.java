package ru.x5.hw01.task4;

import ru.x5.hw01.NumberReader;

public class Task4 {
    public static void main(String[] args) {
        int res = NumberReader.readCorrectInt();
        if (res > 0) {
            System.out.println(res + 1);
        } else if (res < 0) {
            System.out.println(res - 2);
        } else {
            res = 10;
            System.out.println(res);
        }
    }
}
