package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = new String[10];
        int[] intArr = new int[10];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
        }

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = strArr[i].length();
        }

        for (int value : intArr) {
            System.out.println(value);
        }
    }
}
