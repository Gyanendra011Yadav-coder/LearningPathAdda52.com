package com.adda52.learning.polymorphism;

public class Animal {
    void run(){
        System.out.println("Animals Run...");
    }
    void doEatMeat(){
        System.out.println("Not all the Animals....");
    }
    void doSleep(){
        System.out.println("Animals do Sleep...");
    }
    void doSleep(String animal){
        System.out.println(animal+",Always Sleep.....!");
    }
}
