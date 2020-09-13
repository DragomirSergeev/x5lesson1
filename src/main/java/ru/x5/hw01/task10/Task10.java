package ru.x5.hw01.task10;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    array[j + 1] = 0;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
