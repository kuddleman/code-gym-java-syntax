package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dopey = new Dog("Dopey", "Donald Duck", "Chiuawa");
        Cat tom = new Cat("Tom", 4, "Squeak Toy");

        //write your code here
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //write your code here
    public static class Cat {
        String name;
        int age;
        String favoriteToy;

        public Cat (String name, int age, String favoriteToy) {
            this.name = name;
            this.age = age;
            this.favoriteToy = favoriteToy;
        }
    }

    public static class Dog {
        String name;
        String ownerName;
        String breed;

        public Dog(String name, String ownerName, String breed) {
            this.name = name;
            this.ownerName = ownerName;
            this.breed = breed;
        }

    }
}
