package ru.x5.hw05.task1;

public class DbLogger implements Logger {
    @Override
    public void log(String messege) {
        System.out.println("Log into DB: " + messege);
    }
}
