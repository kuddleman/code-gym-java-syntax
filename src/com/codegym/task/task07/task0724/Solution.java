package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        // Grandparents:
        Human greta = new Human("Greta", false, 82);
        Human sam = new Human("Sam", true, 84);
        Human amy = new Human("Amy", false, 75);
        Human lionel = new Human("Lionel", true, 79);

        // Parents:
        Human bill = new Human("Bill", true, 58, sam, greta);
        Human donna = new Human("Donna", false, 54, lionel, amy);

        // children:
        Human ben = new Human("Ben", true,28, bill, donna);
        Human liz = new Human("liz", false, 26, bill, donna);
        Human dan = new Human("Dan", true, 24, bill, donna);

        System.out.println(greta);
        System.out.println(sam);
        System.out.println(amy);
        System.out.println(lionel);
        System.out.println(bill);
        System.out.println(donna);
        System.out.println(ben);
        System.out.println(liz);
        System.out.println(dan);

    }

    public static class Human {
        // write your code here
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}