package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sN = br.readLine();
        int n = Integer.parseInt(sN);

        if ( n == 0) {
            System.out.println("Zero");
        }

        if ( n > 0) {
            if ( isEven(n)) {
                System.out.println("Positive even number");
            } else {
                System.out.println("Positive odd number");
            }
        }

        if ( n < 0) {
            if ( isEven(n)) {
                System.out.println("Negative even number");
            } else {
                System.out.println("Negative odd number");
            }
        }



    }
}
