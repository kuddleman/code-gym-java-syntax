package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yString = br.readLine();
        int year = Integer.parseInt(yString);

        String regYear = "Number of days in the year: 365";
        String leapYear = "Number of days in the year: 366";

        if( year % 400 == 0)
            System.out.println(leapYear);
        else if( year % 100 == 0)
            System.out.println(regYear);
        else if (year % 4 == 0)
            System.out.println(leapYear);
        else
            System.out.println(regYear);

    }
}