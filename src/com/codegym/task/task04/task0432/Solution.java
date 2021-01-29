package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str = br1.readLine();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String sN = br2.readLine();
        int n = Integer.parseInt(sN);

        while ( n > 0) {
            System.out.println(str);
            n -- ;
        }

    }
}
