package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Clintona", "Bill");
        map.put("Clintonb", "Hilary");
        map.put("Shaw", "Tom");
        map.put("Sawyera", "Ann");
        map.put("Sawyer", "Yaya");
        map.put("Thompson", "Fran");
        map.put("Clinton", "Chelsea");
        map.put("Washington", "George");
        map.put("Osterhalle", "George");
        map.put("Pickwick", "Shelly");

        return map;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here

        HashMap<String, String> copy = new HashMap<>(map);

        for (String name : copy.values()) {
            int count = 0;
            for (String _name : map.values()) {
                if(_name.equals(name)) count ++;
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
