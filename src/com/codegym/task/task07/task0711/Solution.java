package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strList = new ArrayList<String>();

        for ( int i = 1; i <= 5; i++) {
            strList.add(br.readLine());
        }

        for (int i = 1; i <= 13; i++) {
            String delStr = strList.remove(strList.size() - 1);
            strList.add(0, delStr);
        }

        for ( int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
