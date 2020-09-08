package ru.x5.hw01.task7;

import ru.x5.hw01.NumberReader;

import java.util.HashMap;

public class Task7 {
//    private static HashMap<Integer, String> names = new HashMap<>();
//    private static HashMap<Integer, Double> taxes = new HashMap<>();
    private static double[] taxes={4.15D,1.98D,2.69D,5.00D};
    private static int[] zips = {905,194,491,800};
    private static String[] names={"Москва","Ростов","Краснодар","Киров"};

    public static void main(String[] args) {
//        fillData();
        int zipCode = NumberReader.readCorrectInt();
//        if (!names.containsKey(zipCode)) {
//            System.out.println("Нет такого кода!");
//            return;
//        }
//        if (!taxes.containsKey(zipCode)) {
//            System.out.println("Нет такого тарифа!");
//            return;
//        }
        int index=0;
        for(int i=0;i<zips.length;i++){
            if(zipCode==zips[i]){
                index=i;
                break;
            }
        }
        System.out.println(names[index] + ". Стоимость разговора: " + taxes[index] * 10);


    }

//    private static void fillData() {
//        names.put(905, "Москва");
//        names.put(194, "Ростов");
//        names.put(491, "Краснодар");
//        names.put(800, "Киров");
//
//        taxes.put(905, 4.15D);
//        taxes.put(194, 1.98D);
//        taxes.put(491, 2.69D);
//        taxes.put(800, 5.00D);
//    }
}
