package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();

        for ( int i = 1; i <= 5; i++) {
            strings.add(br.readLine());
        }

        int longest = strings.get(0).length();
        for ( int i = 0; i < strings.size(); i++) {
              if(strings.get(i).length() > longest) {
                  longest = strings.get(i).length();
              }
        }

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == longest) {
                System.out.println(strings.get(i));
            }
        }
    }
}
