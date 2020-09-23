package ru.x5.hw04.task1;

public class Rectangle implements Shape {
    int lenth;
    int width;

    public Rectangle() {
    }

    public Rectangle(int lenth, int width) {
        this.lenth = lenth;
        this.width = width;
    }

    public int getLenth() {
        return lenth;
    }

    public void setLenth(int lenth) {
        this.lenth = lenth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double square() {
        return lenth * width;
    }
}
