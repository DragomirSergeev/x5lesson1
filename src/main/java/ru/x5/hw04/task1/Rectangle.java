package ru.x5.hw04.task1;

public class Rectangle implements Shape {
    int lenth;
    int width;

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
    public int square() {
        return lenth * width;
    }
}
