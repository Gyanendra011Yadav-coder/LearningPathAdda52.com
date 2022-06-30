package com.adda52.learning.associationandaggregation.composition;

public class Car {
    static Engine engineObject=new Engine(2134567890,1200);
    private  String name;
    private int speed;

    private String Model;

    Car(String name, int speed, String Model) {
        this.name = name;
        this.speed = speed;
        this.Model = Model;
    }

    public static void main(String[] args) {
        engineObject.start();
        engineObject.run();
        engineObject.goingToStop();
    }

}
