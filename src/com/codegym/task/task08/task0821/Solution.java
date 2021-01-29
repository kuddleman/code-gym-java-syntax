package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //write your code here
        // lastname, firstname
        HashMap<String, String> map = new HashMap<>();

        map.put("Thompson", "Charlie");
        map.put("Smith", "Honey");
        map.put("Thompsonb", "Charlie");
        map.put("Pickwick", "Desiree");
        map.put("Thompson", "Angel");
        map.put("Rule", "Harry");
        map.put("Rule", "Celeste");
        map.put("Thompson", "Charlie");
        map.put("Thompsone", "Charlie");
        map.put("Thompsonf", "Charlie");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
