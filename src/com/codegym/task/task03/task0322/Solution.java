package com.codegym.task.task03.task0322;


/* 
Deep and pure love

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String n1 = bufferedReader.readLine();
        String n2 = bufferedReader.readLine();
        String n3 = bufferedReader.readLine();

        System.out.println( n1 + " + " +  n2 + " + " +  n3  + " = Pure love. Ooo la-la!");
    }
}