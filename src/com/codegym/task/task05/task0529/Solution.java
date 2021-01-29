package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("sum")) {
                System.out.println(total);
                break;
            }
            int num = Integer.parseInt(s);
            total += num;
        }

    }
}
