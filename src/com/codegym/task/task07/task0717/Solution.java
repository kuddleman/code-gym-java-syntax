package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strList = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            strList.add(br.readLine());
        }

        ArrayList<String> result = doubleValues(strList);

        // Display result
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code here
        list.add(1, list.get(0));
        for (int i = 0; i < list.size(); i++) {
            String currentStr = list.get(i);
            if (i % 2 != 0 ) {
                list.add(i + 1, currentStr);
            }
        }
        list.remove(0);

        return list;
    }
}
