package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<String, String>();
        // lastname, firstname
        map.put("Clintona", "Bill");
        map.put("Clintonb", "Hilary");
        map.put("Shaw", "Tom");
        map.put("Sawyera", "Ann");
        map.put("Sawyer", "Yaya");
        map.put("Thompson", "Fran");
        map.put("Clinton", "Chelsea");
        map.put("Washington", "George");
        map.put("Osterhalle", "Johann");
        map.put("Pickwick", "Shelly");

        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int count = 0;

        for (String value : map.values()) {
            if (value.equals(name)) {
                count ++;
            }
        }

        return count;



    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int count = 0;
        for (String key : map.keySet()) {
            if (lastName.equals(key)) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
