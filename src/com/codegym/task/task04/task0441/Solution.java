package com.codegym.task.task04.task0441;


/* 
Somehow average

*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bis.readLine());
        int b = Integer.parseInt(bis.readLine());
        int c = Integer.parseInt(bis.readLine());

        if ( a == b && b == c) {
            System.out.println(a);
            return;
        } else if ( a == b || b == c) {
            System.out.println(b);
            return;
        } else if ( c == a) {
            System.out.println(c);
            return;
        }


        int[] myArr = new int[]{a, b, c};

        Arrays.sort(myArr);

        System.out.println(myArr[1]);


    }
}
