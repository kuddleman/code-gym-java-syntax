package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        HashSet<String> mySet =  new HashSet<String>();
        mySet.add("banana");
        mySet.add("watermelon");
        mySet.add("cherry");
        mySet.add("pear");
        mySet.add("cantaloupe");
        mySet.add("ginseng");
        mySet.add("strawberry");
        mySet.add("iris");
        mySet.add("potato");
        mySet.add("blackberry");

        for (String str : mySet) {
            System.out.println(str);
        }


    }
}
