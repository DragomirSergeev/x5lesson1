package ru.x5.hw05.task1;

public class DbLoggerFactory extends LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
