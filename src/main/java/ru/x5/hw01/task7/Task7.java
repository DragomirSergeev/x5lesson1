package ru.x5.hw01.task7;

import ru.x5.hw01.NumberReader;

import java.util.HashMap;

public class Task7 {
    private static HashMap<Integer, String> names = new HashMap<>();
    private static HashMap<Integer, Double> taxes = new HashMap<>();

    public static void main(String[] args) {
        fillData();
        int zipCode = NumberReader.readCorrectInt();
        if (!names.containsKey(zipCode)) {
            System.out.println("Нет такого кода!");
            return;
        }
        if (!taxes.containsKey(zipCode)) {
            System.out.println("Нет такого тарифа!");
            return;
        }
        System.out.println(names.get(zipCode) + ". Стоимость разговора: " + taxes.get(zipCode) * 10);


    }

    private static void fillData() {
        names.put(905, "Москва");
        names.put(194, "Ростов");
        names.put(491, "Краснодар");
        names.put(800, "Киров");

        taxes.put(905, 4.15D);
        taxes.put(194, 1.98D);
        taxes.put(491, 2.69D);
        taxes.put(800, 5.00D);
    }
}
