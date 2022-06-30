package com.adda52.learning.associationandaggregation.aggregtion;

public class Car {
    private  String name;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    private String Model;

    Car(String name, int speed, String Model) {
        this.name = name;
        this.speed = speed;
        this.Model = Model;
    }



}
