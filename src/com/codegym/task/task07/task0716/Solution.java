package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        ArrayList<String> newList = new ArrayList<String>();

        for ( String s : list) {
            if(s.contains("l") && s.contains("r")) {
                newList.add(s);
            } else if ( s.contains("l")) {
                newList.add(s);
                newList.add(s);
            } else if (!s.contains("r")){
                newList.add(s);
            }
        }

        return newList;
    }
}