package com.codegym.task.task10.task1005;

/* 
Task No. 5 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        int a =  44;
        int b =  300;
        short c = (short) (b - a);
        // we want c = 256
        System.out.println(c);
    }
}