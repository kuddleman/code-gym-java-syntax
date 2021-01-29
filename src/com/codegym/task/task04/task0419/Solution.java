package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

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

        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        String n4String = br4.readLine();
        int n4 = Integer.parseInt(n4String);

        //System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);

        int max1 = Math.max(n1, n2);
        int max2 = Math.max(n3, n4);

        System.out.println(Math.max(max1, max2));
    }
}
