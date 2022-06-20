package com.adda52.learning.polymorphism;

public class Horse extends Animal{
    @Override
    void run() {
        System.out.println("Horse Is Runs Very Fast..");
    }

    @Override
    void doEatMeat() {
        System.out.println("Horse Eats Grass...");
    }

    @Override
    void doSleep() {
        System.out.println("Horse Sleeps...");
    }
}
