package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strInput = br.readLine();


        //System.out.println(strInput);

        for ( int i = 0; i < strInput.length(); i++) {
             char elem = strInput.charAt(i);
             int num = Integer.parseInt(String.valueOf(elem));

             if ( num % 2 == 0) {
                 even++;
             } else {
                 odd ++;
             }
        }

        System.out.println("Even: " + even + " Odd: " + odd);




    }
}
