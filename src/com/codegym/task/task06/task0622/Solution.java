package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
//        int n1 = Integer.parseInt(reader.readLine());
//        int n2 = Integer.parseInt(reader.readLine());
//        int n3 = Integer.parseInt(reader.readLine());
//        int n4 = Integer.parseInt(reader.readLine());
//        int n5 = Integer.parseInt(reader.readLine());

       // System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
        int[] numArr = new int[5];

        for ( int i = 0; i < 5; i++) {
            int temp = Integer.parseInt(reader.readLine());
            numArr[i] = temp;
        }

        Arrays.sort(numArr);

        for ( int num : numArr) {
            System.out.println(num);
        }






    }
}
