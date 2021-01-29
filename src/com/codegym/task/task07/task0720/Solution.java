package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strArr = new ArrayList<String>();

        // enter two integers:
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            strArr.add(reader.readLine());
        }

        for (int i = 0; i < m; i++) {
            strArr.add(strArr.remove(0));
        }





        for (int i = 0; i < strArr.size(); i ++) {
            System.out.println(strArr.get(i));
        }


    }
}
