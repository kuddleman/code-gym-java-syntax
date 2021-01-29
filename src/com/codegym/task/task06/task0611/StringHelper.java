package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

public class StringHelper {
    public static String multiply(String s) {
        StringBuilder result = new StringBuilder();
        //write your code here
        for ( int i = 1; i <= 5; i++) {
            result.append(s);
        }
        return result.toString();

    }

    public static String multiply(String s, int count) {
        String result = "";
        //write your code here
        for ( int i = 1; i <= count; i++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
