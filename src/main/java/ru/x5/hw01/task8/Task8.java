package ru.x5.hw01.task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(array);
        System.out.println(array[array.length - 1] + " - максимальное значение");

        int sumPositive = 0;
        int countPossitiive = 0;
        int sumNegP = 0;
        int sumNeg = 0;
        int countNegative = 0;
        for (int i : array) {
            if (i > 0) {
                sumPositive += i;
                countPossitiive++;
            }
            if (i < 0) {
                if (i % 2 == 0) {
                    sumNegP += i;
                }
                sumNeg += i;
                countNegative++;
            }
        }
        System.out.println(sumPositive + " - сумма положительных эллементов");

        System.out.println(sumNegP + " - сумма четтных отрицательнных");

        System.out.println(countPossitiive + " - количество положительных элементов");

        System.out.println(sumNeg / countNegative + " - среднее арифметическое отрицательных элементов");


    }
}
