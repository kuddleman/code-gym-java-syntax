package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> intList = new ArrayList<Integer>();

        // declare int longest sequence (lgSeg) and set it to zero:
        int lgSeq = 1;
        int tempCount = 1;

        for ( int i = 0; i < 10; i++) {
            intList.add(Integer.parseInt(br.readLine()));
        }

        for ( int i = 0; i < 9; i++) {
            if (intList.get(i).equals(intList.get(i + 1))) {
                tempCount ++;
            } else if( tempCount > lgSeq){
                lgSeq = tempCount;
                tempCount = 1;
            } else {
                tempCount = 1;
            }
        }

        if (tempCount > lgSeq) {
            lgSeq = tempCount;
        }
        System.out.println(lgSeq);
    }
}
