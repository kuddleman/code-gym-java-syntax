package com.codegym.task.task05.task0530;

import java.io.*;

/* 
Boss, something weird is happening

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strA = reader.readLine();
        String strB = reader.readLine();

        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);


        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
