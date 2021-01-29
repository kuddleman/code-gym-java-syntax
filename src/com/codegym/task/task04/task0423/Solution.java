package com.codegym.task.task04.task0423;

/* 
Bouncer policy

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String name = br1.readLine();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String sAge = br2.readLine();
        int age = Integer.parseInt(sAge);

        if (age > 20)
            System.out.println("18 is old enough");



    }
}
