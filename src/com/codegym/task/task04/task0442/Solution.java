package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true) {
            int a = Integer.parseInt(bis.readLine());
            sum += a;

            if ( a == -1) {
                System.out.println(sum);
                return;
            }
        }

    }

}
