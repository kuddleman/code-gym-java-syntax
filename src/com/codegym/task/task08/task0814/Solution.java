package com.codegym.task.task08.task0814;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
//        Integer arr[] = {1, 4, 8, 10, 15, 20, -45, -65, 3, 6};
//        Set<Integer> set = Collections.<Integer> emptySet();
//        Collections.addAll(set = new HashSet<Integer>(Arrays.asList(arr)));

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(4);
        set.add(8);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(-45);
        set.add(-65);
        set.add(3);
        set.add(6);
        set.add(81);
        set.add(84);
        set.add(88);
        set.add(810);
        set.add(815);
        set.add(820);
        set.add(-845);
        set.add(-865);
        set.add(83);
        set.add(86);

        return set;



    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        set.removeIf(num -> num > 10);
        return set;
    }

    public static void main(String[] args) {

    }
}
