package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number: ");
//        int num = scanner.nextInt();
//
//        System.out.println("Enter a name: ");
//        String name = scanner.next();
//
//        System.out.println(name + " will take over the world in " + num + " years. Mwa-ha-ha!");

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String sAge = bufferedReader.readLine(); //Read a string from the keyboard
        String name = bufferedReader.readLine(); //Read a string from the keyboard

        int nAge = Integer.parseInt(sAge); //Convert the string to a number.

        System.out.println( name + " will take over the world in " + nAge + " years. Mwa-ha-ha!");

    }
}
