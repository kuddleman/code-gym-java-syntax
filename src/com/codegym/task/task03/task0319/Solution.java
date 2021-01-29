package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //Read a string from the keyboard
        String sNum1 = bufferedReader.readLine(); //Read a string from the keyboard
        String sNum2 = bufferedReader.readLine(); //Read a string from the keyboard
        int iNum1 = Integer.parseInt(sNum1); //Convert the string to a number.
        int iNum2 = Integer.parseInt(sNum2);

        System.out.println( name + " will receive " +iNum1 + " in " + iNum2 + " years.");
    }
}
