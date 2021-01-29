package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int sum = 0;
        String sNum = Integer.toString(number);

        for (int i = 0; i < sNum.length(); i++) {
            char c = sNum.charAt(i);
            int temp = Character.getNumericValue(c);
            sum += temp;
        }

        return sum;
    }
}