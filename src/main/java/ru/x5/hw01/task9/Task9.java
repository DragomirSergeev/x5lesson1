package ru.x5.hw01.task9;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};//четный.
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int last = array[array.length - i - 1];
            int current = array[i];
            array[array.length - i - 1] = current;
            array[i] = last;
        }
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
    }
}
