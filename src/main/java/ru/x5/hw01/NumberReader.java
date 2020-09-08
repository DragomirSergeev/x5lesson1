package ru.x5.hw01;

import java.util.Scanner;

public class NumberReader {
    public static String readCorrectString() {

        Scanner scanner = new Scanner(System.in);
        String entered = "";

        while (true) {
            entered = scanner.nextLine();
            try {
                Integer.parseInt(entered);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entered value is not a number!");
            }
        }
        scanner.close();
        return entered;
    }

    public static int readCorrectInt() {
        return Integer.parseInt(readCorrectString());
    }

    public static String readCorrectString(int count) {

        Scanner scanner = new Scanner(System.in);
        String entered = "";
        boolean correctLine = false;

        while (!correctLine) {
            entered = scanner.nextLine();
            try {
                Integer.parseInt(entered);
                if (entered.length() < count || entered.length() > count) {
                    System.out.println("Entered value length is not " + count + "!");
                    continue;
                }
                correctLine = true;
            } catch (NumberFormatException e) {
                System.out.println("Entered value is not a number!");
            }
        }
        scanner.close();
        return entered;
    }
}
