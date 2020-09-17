package ru.x5.hw06.task2;

import ru.x5.hw06.task2.fuits.Apple;
import ru.x5.hw06.task2.fuits.Fruit;
import ru.x5.hw06.task2.fuits.Orange;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Orange> orangeBox3 = new Box<>();

        appleBox1.add(apple1).add(apple2);
        appleBox2.add(apple3).add(apple4).add(apple5);
        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox1.getWeight());

        appleBox2.mergeToBox(appleBox1);

        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox1.getWeight());

    }
}
