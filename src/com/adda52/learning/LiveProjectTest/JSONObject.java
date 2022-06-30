package com.adda52.learning.LiveProjectTest;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONObject {
    static class Student{
        String name;
        int age;
       public Student(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
       Student student = new Student("Gyan", 21);
       Gson gson=new Gson();
       String json= gson.toJson(student);
       String data="{\"name\":\"GyanedraYadav\",\"age\":21}";
        System.out.println("This is JSON:");
        System.out.println(json);
        System.out.println("Converting Back Data To Object:");
        Student student2=gson.fromJson(data,Student.class);
        System.out.println(student2.name);
        System.out.println(student2.age);
    }
}
