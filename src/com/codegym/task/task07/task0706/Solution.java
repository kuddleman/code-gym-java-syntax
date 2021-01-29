package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int [15];

        for ( int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int oddPeople = 0;
        int evenPeople = 0;

        for ( int i = 0; i < arr.length; i++) {
            if ( i % 2 == 0)
                evenPeople += arr[i];
            else
                oddPeople += arr[i];
        }

        if ( oddPeople > evenPeople)
            System.out.println("Odd-numbered houses have more residents.");
        else
            System.out.println("Even-numbered houses have more residents.");

    }
}
