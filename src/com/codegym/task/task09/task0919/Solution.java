package com.codegym.task.task09.task0919;

/* 
Dividing by zero

*/

public class Solution {

    public static void main(String[] args) {

        try{
            divideByZero();
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void divideByZero(){

        int x = 10 / 0;
        System.out.println(x);
    }
}
