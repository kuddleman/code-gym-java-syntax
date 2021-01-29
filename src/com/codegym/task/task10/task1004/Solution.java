package com.codegym.task.task10.task1004;

/* 
Task No. 4 about integer type conversions

*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = (short)'0';
        int nine = (zero + number);
        // we want nine = 0;

        System.out.println((char)nine);
    }
}
