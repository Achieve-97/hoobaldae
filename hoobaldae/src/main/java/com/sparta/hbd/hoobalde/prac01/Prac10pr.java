package com.sparta.hbd.hoobalde.prac01;

abstract class Figure{
    abstract void area(int a, int b);
}

// 사각형

class Square extends Figure {
    @Override
    void area(int a, int b) {
        System.out.println("사각형의 넓이: "+ (a*b));
    }
}

class Triangle extends Figure {
    @Override
    void area(int a, int b) {
        System.out.println("삼각형의 넓이: " + (a*b/2));
    }
}
public class Prac10pr {
    public static void main(String[] args) {

        Square square = new Square();
        square.area(10, 7);

        Triangle triangle = new Triangle();
        triangle.area(15, 8);



    }
}
