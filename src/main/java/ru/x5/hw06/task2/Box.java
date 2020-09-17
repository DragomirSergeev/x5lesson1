package ru.x5.hw06.task2;

import ru.x5.hw06.task2.fuits.Fruit;

import java.util.ArrayList;
import java.util.Iterator;

public class Box<T extends Fruit> {

    private ArrayList<T> elements;
    private float totalWeight;

    public Box() {
        elements=new ArrayList<>();
    }

    public Box<T> add(T fruit){
        elements.add(fruit);
        this.totalWeight+=fruit.getWeight();
        return this;
    }

    public void remove(T fruit){
        elements.remove(fruit);
        this.totalWeight-=fruit.getWeight();
    }

    float getWeight(){
        return this.totalWeight;
    }

    public boolean compare(Box box){
        return this.getWeight()==box.getWeight();
    }

    public void mergeToBox(Box<T> box){
        while(this.elements.size()!=0){
            box.add(this.elements.get(0));
            remove(this.elements.get(0));
        }
    }

}
