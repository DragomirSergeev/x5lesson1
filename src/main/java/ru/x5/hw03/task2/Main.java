package ru.x5.hw03.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Horse(), new Animal()};
        Veterinar veterinar = new Veterinar();
        for (Animal animal : animals) {
            veterinar.treatAnimal(animal);
        }
    }
}
