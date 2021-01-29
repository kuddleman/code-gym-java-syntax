package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String sN1 = br1.readLine();
        int n1 = Integer.parseInt(sN1);

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String sN2 = br2.readLine();
        int n2 = Integer.parseInt(sN2);

        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String sN3 = br1.readLine();
        int n3 = Integer.parseInt(sN3);

        int[] myList = new int[3];
        myList[0] = n1;
        myList[1] = n2;
        myList[2] = n3;

        int count = 0;

        for ( int i : myList) {
            if ( i > 0)
                count ++;
        }
        System.out.println(count);

    }
}
