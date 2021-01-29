package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        double ex1 = convertEurToUsd(100, 1.23);
        double ex2 = convertEurToUsd(50, 1.23);

        System.out.println(ex1);
        System.out.println(ex2);
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //write your code here
        return eur * exchangeRate;

    }
}
