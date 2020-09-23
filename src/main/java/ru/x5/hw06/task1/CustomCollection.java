package ru.x5.hw06.task1;

public interface CustomCollection<T> {
    int size();

    void add(T item);

    void remove(int index);

    void remove(T item);

    T get(int index);

    void clear();
}
