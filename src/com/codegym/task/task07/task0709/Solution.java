package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strList = new ArrayList<String>();

        for ( int i = 1; i <= 5; i++) {
            strList.add(br.readLine());
        }

        int shortest = strList.get(0).length();

        for (int i = 0; i < strList.size(); i ++) {
            if(strList.get(i).length() < shortest) {
                shortest = strList.get(i).length();
            }
        }

        for (int i = 0; i < strList.size(); i++)
            if (strList.get(i).length() == shortest)
                System.out.println(strList.get(i));


    }
}
