package ru.x5.hw03.task3;

public class Main {
    public static void main(String[] args) {
        Student aspirant = new Aspirant();
        Student[] students = {new Student(),new Aspirant(),new Aspirant()};
        for(Student student : students){
            student.getScholarship();
        }
    }
}
