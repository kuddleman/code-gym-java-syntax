package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<Integer>(10);
        for (int i = 1; i <=10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        //write your code here
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
