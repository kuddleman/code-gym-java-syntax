package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int maximum = ;

        //write your code here

        //System.out.println(maximum);

        int numInputs = Integer.parseInt(reader.readLine());

        if ( numInputs <= 0) {
            return;
        }

        int index = 0;
        int[] numArr = new int[numInputs];


        while (numInputs > 0) {
            int num = Integer.parseInt(reader.readLine());
            numArr[index] = num;
            numInputs --;
            index ++;
        }

        int maximum = numArr[0];
        for ( int i = 1; i < numArr.length; i++) {
            if( numArr[i] > maximum) {
                maximum = numArr[i];
            }
        }
        System.out.println(maximum);
    }
}
