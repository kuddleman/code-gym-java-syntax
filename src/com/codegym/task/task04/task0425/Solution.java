package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String aString = br1.readLine();
        int a = Integer.parseInt(aString);

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String bString = br2.readLine();
        int b = Integer.parseInt(bString);

        int q1 = 1;
        int q2 = 2;
        int q3 = 3;
        int q4 = 4;

        if (a > 0 && b > 0)
            System.out.println(q1);
        else if ( a < 0 && b > 0)
            System.out.println(q2);
        else if ( a < 0 && b < 0)
            System.out.println(q3);
        else if ( a > 0 && b < 0)
            System.out.println(q4);



    }
}
