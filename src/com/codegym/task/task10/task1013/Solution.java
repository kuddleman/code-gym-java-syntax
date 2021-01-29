package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String name;
        private int age;
        private String birthPlace;
        private String address;
        private int numberOfChildren;
        private String occupation;

        public Human() {

        }

        public Human(String name, int age, String birthPlace, String address, int numberOfChildren, String occupation) {
            this.name = name;
            this.age = age;
            this.birthPlace = birthPlace;
            this.address = address;
            this.numberOfChildren = numberOfChildren;
            this.occupation = occupation;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public Human (String name, String occupation) {
            this.name = name;
            this.occupation = occupation;
        }

        public Human (String name, int age, int numberOfChildren) {
            this.name = name;
            this.age = age;
            this.numberOfChildren = numberOfChildren;
        }

        public Human (int age, String birthPlace) {
            this.age = age;
            this.birthPlace = birthPlace;
        }

        public Human ( int age, String birthPlace, String occupation) {
            this.age = age;
            this.birthPlace = birthPlace;
            this.occupation = occupation;
        }

        public Human (int age, String birthPlace, int numberOfChildren) {
            this.age = age;
            this.birthPlace = birthPlace;
            this.numberOfChildren = numberOfChildren;
        }







    }
}
