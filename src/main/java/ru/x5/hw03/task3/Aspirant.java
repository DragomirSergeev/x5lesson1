package ru.x5.hw03.task3;

public class Aspirant extends Student {
    String scienceWork;

    @Override
    int getScholarship(){
        return averageMark==5 ? 200 : 180;
    }
}
