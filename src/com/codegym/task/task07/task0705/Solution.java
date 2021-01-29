package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] bigArr1 = new int[20];
        for(int i = 0; i < bigArr1.length; i++) {
            bigArr1[i] = Integer.parseInt(br.readLine());
        }

        int[] smArr1 = new int[10];
        int[] smArr2 = new int[10];

        for(int i = 0; i < smArr1.length; i++) {
            smArr1[i] = bigArr1[i];
        }

        int smArr2Idx = 0;
        int bigArrIdx = 10;

        while(smArr2Idx < smArr2.length) {
             smArr2[smArr2Idx] = bigArr1[bigArrIdx];
             smArr2Idx ++;
             bigArrIdx ++;
        }

        for (int value : smArr2) {
            System.out.println(value);
        }
    }
}
