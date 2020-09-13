package ru.x5.hw03.task2;

public class Cat extends Animal {
    private int mouseHunted;


    @Override
    protected void makeNoise() {
        System.out.println("Кошка спит.");
    }

    public int getMouseHunted() {
        return mouseHunted;
    }

    public void setMouseHunted(int mouseHunted) {
        this.mouseHunted = mouseHunted;
    }
}
