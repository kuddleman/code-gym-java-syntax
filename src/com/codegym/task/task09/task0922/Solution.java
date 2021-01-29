package com.codegym.task.task09.task0922;

import sun.java2d.pipe.SpanShapeRenderer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //read in the date as a string.
        // user should enter something like  "2020-10-23"
        String date1 = reader.readLine();

        //Set up the formatting for the date object.
        // we want to turn the String date1 into a date object

        SimpleDateFormat ft1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = ft1.parse(date1);


        //Set up formatting for how we want the date to look:
        SimpleDateFormat ft = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        System.out.println(ft.format(date).toUpperCase());
    }
}
