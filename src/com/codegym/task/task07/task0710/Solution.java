package com.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
To the top of the list

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strList = new ArrayList<String>();



        for (int i = 0; i < 10; i ++) {
            String temp = br.readLine();
            strList.add(0, temp);
        }

        for ( int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

    }
}
