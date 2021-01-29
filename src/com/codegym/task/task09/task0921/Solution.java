package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        ArrayList<Integer> nums = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(true) {
                int newInt = Integer.parseInt(br.readLine());
                nums.add(newInt);
            }
        } catch (NumberFormatException | IOException e) {
            for ( int num : nums) {
                System.out.println(num);
            }
           // e.printStackTrace();
        }
    }
}
