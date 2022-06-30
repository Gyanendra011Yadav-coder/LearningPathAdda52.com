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
        System.out.println(json);
    }
}
