package ru.x5.hw03.task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Phone {
    long number;
    String moodel;
    double weight;

    public Phone() {
    }

    public Phone(long number, String moodel) {
        this.number = number;
        this.moodel = moodel;
    }

    public Phone(long number, String model, double weight) {
        this(number,model);
    }

    long getNumber(){
        return this.number;
    }

    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, long number){
        System.out.println("Звонит " + name +" "+number);
    }

    void sendMessage(long[] numbers){
        for(long number : numbers){
            System.out.println(number);
        }
    }
}
