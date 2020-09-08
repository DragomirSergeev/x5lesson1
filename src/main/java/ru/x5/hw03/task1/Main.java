package ru.x5.hw03.task1;

public class Main {
    public static void main(String[] args) {
        Phone[] phones = {new Phone(),
        new Phone(81441,"Somebody"),
        new Phone(2352350,"Somebody2",0.1D)};

        for(Phone phone : phones){
            System.out.println("Номер: "+phone.number+" Модель: "+phone.moodel+" Вес: "+phone.weight);
        }
        for(Phone phone : phones){
            phone.receiveCall("Контакт 1");
        }
        for(Phone phone : phones){
            phone.receiveCall("Контакт 2",666666666);
        }
        for(Phone phone : phones){
            phone.sendMessage(new long[] {14414124,3252523,27655345});
        }

    }
}
