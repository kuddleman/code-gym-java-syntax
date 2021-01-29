package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strList = new ArrayList<String>();

        for ( int i = 1; i <= 10; i++) {
            strList.add(br.readLine());
        }

        int longestLen = strList.get(0).length();
        int shortestLen = strList.get(0).length();

        String longestStr = strList.get(0);
        String shortestStr = strList.get(0);
        int idxOfLongest = 0;
        int idxOfShortest = 0;

        for ( int i = 0; i < strList.size(); i++) {
            if ( strList.get(i).length() > longestLen) {
                longestLen = strList.get(i).length();
                longestStr = strList.get(i);
                idxOfLongest = i;
            }
            if ( strList.get(i).length() < shortestLen) {
                shortestLen = strList.get(i).length();
                shortestStr = strList.get(i);
                idxOfShortest = i;
            }
        }

        if ( idxOfLongest < idxOfShortest)
            System.out.println(longestStr);
        else
            System.out.println(shortestStr);







    }
}
