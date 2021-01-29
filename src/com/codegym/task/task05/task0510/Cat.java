package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here
    private String name;
    private int weight;
    private int age;
    private String color;
    private String address;

    public void initialize(String name) {
        this.name = name;
        this.weight = 5;
        this.age = 4;
        this.color = "brown";
        this.address = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "brown";
        this.address = null;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 5;
        this.age = age;
        this.color = "brown";
        this.address = null;
    }

    public void initialize(int weight, String color) {
        this.name = null;
        this.weight = weight;
        this.age = 5;
        this.color = color;
        this.address = null;
    }

    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.age = 4;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
