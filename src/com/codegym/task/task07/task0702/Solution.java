package com.codegym.task.task07.task0702;

//import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < 8; i++) {
            list[i] = br.readLine();
        }

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}