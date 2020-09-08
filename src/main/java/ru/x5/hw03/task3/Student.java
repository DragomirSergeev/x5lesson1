package ru.x5.hw03.task3;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    int getScholarship(){
        return averageMark==5 ? 100 : 80;
    }
}
