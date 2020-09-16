package ru.x5.hw04.task1;

public class Circle implements Shape {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int square() {
        return (int) ((radius * 3.14D) * (radius * 3.14D));
    }
}
