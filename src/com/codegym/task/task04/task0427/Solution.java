package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

//import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class Solution {
    public static boolean isEven(int a) {
        return (a % 2 == 0);
    }
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sN = br.readLine();
        int n = Integer.parseInt(sN);

        if ( n >= 100 && n <= 999) {
            if (isEven(n)) {
                System.out.println("even three-digit number");
            } else {
                System.out.println("odd three-digit number");
            }
        }
        if ( n >= 10 && n <= 99) {
            if (isEven(n)) {
                System.out.println("even two-digit number");
            } else {
                System.out.println("odd two-digit number");
            }
        }
        if ( n >= 1 && n <= 9) {
            if (isEven(n)) {
                System.out.println("even single-digit number");
            } else {
                System.out.println("odd single-digit number");
            }

        }



    }
}
