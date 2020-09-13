package ru.x5.hw04.task1;

public class Triangle implements Shape {
    int height;
    int bSide;
    int cSide;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getbSide() {
        return bSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }

    public int getcSide() {
        return cSide;
    }

    public void setcSide(int cSide) {
        this.cSide = cSide;
    }

    @Override
    public int square() {
        return cSide * height / 2;
    }
}
