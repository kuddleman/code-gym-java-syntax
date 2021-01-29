package com.codegym.task.task04.task0409;

/* 
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
        displayClosestToTen(-1, -45);
        displayClosestToTen(34, 34);
    }

    public static void displayClosestToTen(int a, int b) {
//       //A. find the absolute value of each parameter:
//        int abA = abs(a);
//        int abB = abs(b);
//
//        //B. find the difference between the absolute value of each
//            // parameter and 10:
//        int diffA = abA - 10;
//        int diffB = abB - 10;
//
//        //C. find the absolute value of the difference found in B above:
//        int absDiffA = abs(diffA);
//        int absDiffB = abs(diffB);
//
//        //D. Compare the differences found in D above:
//        if ( absDiffA < absDiffB)
//            System.out.println(a);
//        else if (absDiffA > absDiffB)
//            System.out.println(b);
//        else
//            System.out.println(a);
        System.out.println(abs(a - 10) <= abs(b - 10) ? a : b);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}