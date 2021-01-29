package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Waif");
        strList.add("Sleepy");
        strList.add("Crocker");
        strList.add("Brave");
        strList.add("Star");

        System.out.println(strList.size());

        for (String elem : strList) {
            System.out.println(elem);
        }

    }
}
