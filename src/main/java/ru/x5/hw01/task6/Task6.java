package ru.x5.hw01.task6;

import ru.x5.hw01.NumberReader;

public class Task6 {
    public static void main(String[] args) {
        int res = NumberReader.readCorrectInt();
        StringBuilder sb = new StringBuilder();
        sb.append(res);
        if (res == 0) {
            sb.append(" Нулевое ");
        } else if (res > 0) {
            sb.append(" Положительное ");
        } else {
            sb.append(" Отрицательное ");
        }
        if (res == 0) {
            sb.append("число.");
        } else if (res % 2 != 0) {
            sb.append("нечетное число.");
        } else {
            sb.append("четное число.");
        }
        System.out.println(sb);
    }
}
