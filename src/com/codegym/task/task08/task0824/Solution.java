package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Human c1 = new Human("Lisa", false, 5);
        Human c2 = new Human ("Daniel", true, 7);
        Human c3 = new Human ("Gregory", true, 2);



        Human father = new Human("Peter", true, 45, c1, c2, c3);
        Human mother = new Human("Liz", false, 42, c1, c2, c3);





        Human gf1 = new Human("George", true, 68, father);
        Human gm1 = new Human ("Missy", false, 65, father);

        Human gf2 = new Human ("Charles", true, 70, mother);
        Human gm2 = new Human ("Betsy", false, 63, mother);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);

    }

    public static class Human {
        //write your code here
         String name;
         boolean sex;
         int age;
         ArrayList<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            Collections.addAll(this.children, children);
        }

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
