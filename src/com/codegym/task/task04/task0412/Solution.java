package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numString = br.readLine();
        int num = Integer.parseInt(numString);
        if ( num > 0)
            num *= 2;
        else if (num < 0)
            num ++;


        System.out.println(num);
    }

}