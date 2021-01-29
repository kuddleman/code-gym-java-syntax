package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        int[] numbers = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        return numbers;
    }

    public static int max(int[] array) {
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest)
                largest = array[i];
        }
        return largest;
    }
}
