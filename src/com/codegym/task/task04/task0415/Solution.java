package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

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

        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String cString = br3.readLine();
        int c = Integer.parseInt(cString);

//        System.out.println("This is a " + a);
//        System.out.println("This is b " + b);
//        System.out.println("This is c " + c);

        if ( a + b > c && a + c > b && b + c > a)
            System.out.println("The triangle is possible." );
        else
            System.out.println("The triangle is not possible.");


    }


}