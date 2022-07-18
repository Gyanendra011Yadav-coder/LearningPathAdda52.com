package com.adda52.learning.Enum;


public class EnumWithInClassInitialization {
       public enum days{
            Sunday,
            Monday,
           Tuesday,
           Wednesday,
           Thursday,
           Friday,
           Saturday;
           public static void DayOfWeek(int dayNumber) {
               switch (dayNumber) {
                       case 0:
                           System.out.println(Sunday);
                           break;
                       case 1:
                           System.out.println(Monday);
                           break;
                       case 2:
                           System.out.println(Tuesday);
                           break;
                       case 3:
                           System.out.println(Wednesday);
                           break;
                       case 4:
                           System.out.println(Thursday);
                           break;
                       case 5:
                           System.out.println(Friday);
                           break;
                       case 6:
                           System.out.println(Saturday);
                           break;
                        default:
                            System.out.println("Unknown Day Number");
               }
           }
    }

    public static void main(String[] args) {
        for (int i = 0; i <=6 ; i++) {
            EnumWithInClassInitialization.days.DayOfWeek(i);
        }
    }
}
