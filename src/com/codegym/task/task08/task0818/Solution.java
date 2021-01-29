package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> map = new HashMap<>();

        map.put("abc", 5000);
        map.put("abcd", 15000);
        map.put("abcde", 8000);
        map.put("abcas", 400);
        map.put("abckl", 500000);
        map.put("abci", 300);
        map.put("abcmx", 800);
        map.put("abcnv", 200);
        map.put("abcr", 100);
        map.put("abclo", 12000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }

    }

    public static void main(String[] args) {

    }
}