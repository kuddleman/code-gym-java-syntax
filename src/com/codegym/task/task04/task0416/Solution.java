package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dString = br.readLine();
        double t = Double.parseDouble(dString);
        //System.out.println(t);
//        int a = 5;
//      double b = 2.5;
//        System.out.println(b % a);

        double min = 5.0;

        if ( t % min >= 4)
            System.out.println("red");
        else if ( t % min >= 3)
            System.out.println("yellow");
        else
            System.out.println("green");
    }
}