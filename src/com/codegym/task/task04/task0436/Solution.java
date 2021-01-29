package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String sM = br1.readLine();
        int m = Integer.parseInt(sM);

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String sN = br2.readLine();
        int n = Integer.parseInt(sN);

        String eightLine = "";

        for ( int i = 0; i < n; i++) {
            eightLine += "8";
        }

       for ( int i = 0; i < m; i++) {
           System.out.println(eightLine);
       }



    }
}
