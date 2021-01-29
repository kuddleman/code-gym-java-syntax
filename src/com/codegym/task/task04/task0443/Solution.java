package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;
import java.net.Inet4Address;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String name = br1.readLine();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String sYear = br2.readLine();
        int year = Integer.parseInt(sYear);

        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String sMonth = br3.readLine();
        int month = Integer.parseInt(sMonth);

        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        String sDay = br4.readLine();
        int day = Integer.parseInt(sDay);



        System.out.println("My name is " + name + ".");

        System.out.println("I was born on " + month + "/" + day + "/" + year);


    }
}
