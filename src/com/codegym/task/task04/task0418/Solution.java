package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n1String = br.readLine();
        int n1 = Integer.parseInt(n1String);

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String n2String = br2.readLine();
        int n2 = Integer.parseInt(n2String);

        //System.out.println(n1 + " " + n2);
        if ( n1 == n2)
            System.out.println(n1);
        else
            System.out.println(Math.min(n1, n2));

        ;

    }
}