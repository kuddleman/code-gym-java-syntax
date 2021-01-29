package com.codegym.task.task04.task0424;

/* 
Three numbers

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
        String sN3 = br3.readLine();
        int n3 = Integer.parseInt(sN3);

        if ( n1 == n2)
            System.out.println(3);
        else if ( n1 == n3)
            System.out.println(2);
        else if ( n2 == n3)
            System.out.println(1);
    }
}
