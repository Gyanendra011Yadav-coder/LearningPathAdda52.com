package com.adda52.learning.serializationAndDeserialization;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee("Gyanendra",345678,21,"Agra");
        //this will serialize the employee into the following file that we have specified
        try{
        FileOutputStream fileOutputStream= new FileOutputStream("employeeDetails.txt");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        //will be sending this by serialization
        objectOutputStream.writeObject(employee);
        fileOutputStream.close();
        objectOutputStream.close();
    }catch (IOException e){
            System.out.println("Serialization failed: " + e.getMessage());
        }
    }
}
