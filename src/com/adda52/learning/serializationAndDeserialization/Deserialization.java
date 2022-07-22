package com.adda52.learning.serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        Employee employee=new Employee("gyanendra",345678,21,"Agra");
        employee=null;
        try {
            FileInputStream fileInputStream= new FileInputStream("employeeDetails.txt");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            employee = (Employee)objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
            System.out.println("Retuned Deserializing it:");
            Employee.writeObject(employee);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
