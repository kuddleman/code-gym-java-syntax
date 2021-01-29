package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        cats.remove(cats.toArray()[0]);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        HashSet<Cat> myCats = new HashSet<>();
        myCats.add(cat1);
        myCats.add(cat2);
        myCats.add(cat3);

        return myCats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for ( Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1
    public static class Cat {

    }
}
