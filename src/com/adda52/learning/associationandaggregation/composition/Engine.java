package com.adda52.learning.associationandaggregation.composition;

import java.util.Map.Entry;

public class Engine {
    int horsePower;
    int engineNumbers;
    public static void needMaintenance() {
        System.out.println("!!!Require Maintenance...........~~~~~~~~~~~~~");
    }
    public static void start(){
        System.out.println("Engine is starting..!!!!");
    }
     public void run(){
         System.out.println("Engine is running...");
     }
     public void goingToStop(){
         System.out.println("Engine is Going to Stop...");
     }

     Engine(int name, int power){
        this.engineNumbers = name;
        this.horsePower=power;
     }

}
