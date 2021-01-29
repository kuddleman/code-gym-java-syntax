package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

//import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int count = 0;

        while(true) {
            int a = Integer.parseInt(bis.readLine());
            

            if (a == -1) {
                
                
                System.out.println(sum / count);
                return;
            }
            count ++;
            sum += a;
        }
    }
}

