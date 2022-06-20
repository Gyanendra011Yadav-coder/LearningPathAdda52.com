package com.adda52.learning.polymorphism;

public class Cat extends Animal{
    @Override
    void run() {
        System.out.println("Cat Is Runnning..");
    }

    @Override
    void doEatMeat() {
        System.out.println("Cat Eats Rats...");
    }

    @Override
    void doSleep() {
        System.out.println("Cat Sleeps...");
    }
}
