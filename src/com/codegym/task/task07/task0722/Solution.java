package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //write your code here
        ArrayList<String> str = new ArrayList<String>();

        while(true) {

           String addStr = (reader.readLine());
           if (!addStr.equals("end")) {
               str.add(addStr);
           } else if ( addStr.equals("end")) {
               break;
           }

        }

        for ( String s : str) {
            System.out.println(s);
        }



    }
}