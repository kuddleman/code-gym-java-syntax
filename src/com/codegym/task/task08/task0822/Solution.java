package com.codegym.task.task08.task0822;

//import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Find the minimum here

         int min;

        return min = Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        ArrayList<Integer> list = new ArrayList<Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for ( int i = 0; i < n; i++) {
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            list.add(Integer.parseInt(br2.readLine()));
        }




        return list;
    }
}
