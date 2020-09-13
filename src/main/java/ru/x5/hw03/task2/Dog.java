package ru.x5.hw03.task2;

public class Dog extends Animal {
    private int voiceLoud;


    @Override
    protected void makeNoise() {
        System.out.println("Собака спит.");
    }

    public int getVoiceLoud() {
        return voiceLoud;
    }

    public void setVoiceLoud(int voiceLoud) {
        this.voiceLoud = voiceLoud;
    }
}
