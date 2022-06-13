package com.adda52.learning.encapsulation;

public class AreaTriangleAndSquare {
    int length = 0;
    int breadth = 0;
    AreaTriangleAndSquare(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //Area of Rectangle
    public int areaOfRectangle(int length, int breadth){
            return length*breadth;
    }

    //Area of Square
    public int areaOfSquare(int side){
        return (int) Math.sqrt(side);
    }

    //Area Of Triangle
    public int areaOfTriangle(int side){
        return 1/2*side;
    }
}
