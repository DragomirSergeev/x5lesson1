package ru.x5.hw01.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] ints = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            boolean correctLine = false;
            while (!correctLine) {
                String entered = scanner.nextLine();
                try {
                    ints[i] = Integer.parseInt(entered);
                    correctLine = true;
                } catch (NumberFormatException e) {
                    System.out.println("Entered value is not a number!");
                }
            }
        }
        scanner.close();
        Arrays.sort(ints);
        System.out.println(ints[0]);
    }
}
