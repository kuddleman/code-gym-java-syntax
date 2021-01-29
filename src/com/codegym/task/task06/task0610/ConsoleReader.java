package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();

    }

    public static int readInt() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static double readDouble() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());
    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String trueOrFalse = reader.readLine();

        return trueOrFalse.equals("true");

    }

    public static void main(String[] args) {

    }
}
