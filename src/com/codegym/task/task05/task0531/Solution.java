package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Improving functionality

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

//        int minimum1 = min(a, b);
//        int minimun2 = min(c, d);
//        int minimun3 = min(minimum1, minimun2);
//        int finalMin = min(minimun3, e);

        System.out.println("Minimum = " + min(a, b, c, d, e));
    }


    public static int min(int a, int b, int c, int d, int e) {
//        int minimum1 = min(a, b);
//        int minimun2 = min(c, d);
//        int minimun3 = min(minimum1, minimun2);
//        int finalMin = min(minimun3, e);
        int[] numsArr = new int[]{a,b,c,d,e};
        int least = numsArr[0];
        for ( int i = 1; i < numsArr.length; i++) {
            if ( numsArr[i] < least) {
                least = numsArr[i];
            }


        }
        return least;
    }
}
