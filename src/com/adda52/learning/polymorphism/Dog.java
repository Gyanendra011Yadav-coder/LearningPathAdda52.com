package com.adda52.learning.polymorphism;

public class Dog extends Animal{
    @Override
    void run() {
        System.out.println("Dog Is Runnning..");
    }

    @Override
    void doEatMeat() {
        System.out.println("Dog Eats Meat...");
    }

    @Override
    void doSleep() {
        System.out.println("Dog Sleeps...");
    }


}
