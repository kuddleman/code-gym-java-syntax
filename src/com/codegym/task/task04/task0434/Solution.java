package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
//        for(int i=1; i<=10; i++){
//            for(int j=1; j<=10; j++){
//                System.out.print(i*j+" ");
//            }
//            System.out.println();
//        }

        int i = 1;
        while ( i < 11) {
            int j = 1;
            while( j < 11) {
                System.out.print(i * j);
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;

        }

    }
}
