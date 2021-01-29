package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] intArr = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for ( int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = intArr.length - 1; i >=0; i--) {
            System.out.println(intArr[i]);
        }
    }
}

