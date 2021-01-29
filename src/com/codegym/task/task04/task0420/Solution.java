package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String n1String = br1.readLine();
        int n1 = Integer.parseInt(n1String);

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String n2String = br2.readLine();
        int n2 = Integer.parseInt(n2String);

        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String n3String = br3.readLine();
        int n3 = Integer.parseInt(n3String);

        int max = Math.max(Math.max(n1,n2), n3);
        int min = Math.min(Math.min(n1,n2), n3);

//        System.out.println("Max is: " + max);
//        System.out.println("Min is: " + min);

        int middle = Math.max(Math.min(n1,n2), Math.min(Math.max(n1,n2),n3));



        System.out.println(max + " " + middle + " " + min);



    }
}
