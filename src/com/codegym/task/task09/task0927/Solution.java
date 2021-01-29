package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        // name CAT
        HashMap<String,Cat> map = new HashMap<>();

        Cat cat1 = new Cat("name1");
        Cat cat2 = new Cat("name2");
        Cat cat3 = new Cat("name3");
        Cat cat4 = new Cat("name4");
        Cat cat5 = new Cat("name5");
        Cat cat6 = new Cat("name6");
        Cat cat7 = new Cat("name7");
        Cat cat8 = new Cat("name8");
        Cat cat9 = new Cat("name9");
        Cat cat10 = new Cat("name10");

        map.put("name1", cat1);
        map.put("name2", cat2);
        map.put("name3", cat3);
        map.put("name4", cat4);
        map.put("name5", cat5);
        map.put("name6", cat6);
        map.put("name7", cat7);
        map.put("name8", cat8);
        map.put("name9", cat9);
        map.put("name10", cat10);

        return map;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        HashSet<Cat> set = new HashSet<>();

        map.forEach((key,value) -> set.add(value));

        return set;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
