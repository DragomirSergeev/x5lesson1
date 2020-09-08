package ru.x5.hw03.task2;

public class Animal {
    protected String food;
    protected String location;

    protected void makeNoise() {
        System.out.println(" Животное спит.");
    }

    protected void sleep() {

    }

    protected void eat() {

    }

    //getters\setters
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
