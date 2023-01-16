package com.sparta.hbd.hoobalde.prac01;

abstract class Animal {
    String name;
    int age;
    String howling;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void howl(){
        System.out.println(this.howling  + " 내 이름은"+this.name+","+age+"살!");
    }
    abstract void charming();
}
class Cat extends Animal {

    public Cat(String name, int age){
        super(name, age);
        this.howling = "야옹";
    }
    @Override
    void charming() {
        System.out.println("부비부비!");
    }
}
class Dog1 extends Animal {
    public Dog1(String name, int age){
        super(name, age);
        this.howling = "멍멍";
    }
    @Override
    void charming() {
        System.out.println("배까고 드러눕기!");

    }
}

public class Prac10 {
    public static void main(String[] args) {

        Cat a = new Cat("나비", 5);
        Dog1 b = new Dog1("바둑이", 3);

        a.howl();
        b.howl();

        a.charming();
        b.charming();

    }
}
