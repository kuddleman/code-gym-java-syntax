package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        String n1String = br1.readLine();
        String n2String = br1.readLine();
        String n3String = br1.readLine();

        int n1 = Integer.parseInt(n1String);
        int n2 = Integer.parseInt(n2String);
        int n3 = Integer.parseInt(n3String);

       // System.out.println(n1 + " " + n2 + " " + n3);

        if ( n1 == n2 && n1 == n3) {
            System.out.println((n1 + " " + n2 + " " + n3));
        }
        else if ( n1 == n2) {
            System.out.println(n1 + " " + n2);
        }
        else if ( n1 == n3) {
            System.out.println(n1 + " " + n3);
        }
        else if ( n2 == n3) {
                System.out.println(n2 + " " + n3);
        }




        }


}