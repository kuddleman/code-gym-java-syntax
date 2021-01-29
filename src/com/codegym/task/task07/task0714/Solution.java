package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse

*/

public class Solution {


    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 1; i <= 5; i++) {
            list.add(br.readLine());
        }

        list.remove(2);

        for ( int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }





    }
}


