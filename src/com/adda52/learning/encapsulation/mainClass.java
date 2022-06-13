package com.adda52.learning.encapsulation;

public class mainClass {
    public static void main(String[] args) {
        int length = 12;
        int breadth = 20;
        int side = 4;
        AreaTriangleAndSquare object = new AreaTriangleAndSquare(length,breadth);
        object.areaOfSquare(side);
        object.areaOfRectangle(length, breadth);
        object.areaOfTriangle(side);
    }
}
