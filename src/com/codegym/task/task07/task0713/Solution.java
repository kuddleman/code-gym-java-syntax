package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<Integer>();

        ArrayList<Integer> by3 = new ArrayList<Integer>();
        ArrayList<Integer> by2 = new ArrayList<Integer>();
        ArrayList<Integer> others = new ArrayList<Integer>();



        for ( int i = 0; i < 20; i++) {
            int temp = Integer.parseInt(br.readLine());
            //Integer intTemp = temp;
            nums.add(temp);
        }

        //System.out.println(nums.size());

        for ( int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 6 == 0) {
                by3.add(nums.get(i));
                by2.add(nums.get(i));
            } else if (nums.get(i) % 3 == 0) {
                by3.add(nums.get(i));
            } else if (nums.get(i) % 2 == 0) {
                by2.add(nums.get(i));
            } else {
                others.add(nums.get(i));
            }
        }

        printList(by3);
        printList(by2);
        printList(others);

    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
