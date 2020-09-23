package ru.x5.hw04.task1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(2,3,1);
        shape[1] = new Circle(4);
        shape[2] = new Rectangle(2,4);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.getClass().getSimpleName() +" "+sh.square());
        }
    }
}
