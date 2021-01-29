package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br1.readLine();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String name2 = br2.readLine();

        if (name1.equals(name2))
            System.out.println("The names are identical");
        else if (name1.length() == name2.length())
            System.out.println("The names are the same length");


    }
}
