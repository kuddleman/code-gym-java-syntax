package com.codegym.task.task04.task0422;

/* 
18+

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String ageString = br.readLine();
        int age = Integer.parseInt(ageString);

        if ( age < 18)
            System.out.println("Grow up a little more");

    }
}
