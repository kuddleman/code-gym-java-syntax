package com.codegym.task.task09.task0923;

//import sun.lwawt.macosx.CPrinterDevice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> consonants = new ArrayList<Character>();
        ArrayList<Character> vowels = new ArrayList<Character>();

        String s = br.readLine();

        //string to char array
        char[] chars = s.replaceAll(" ", "").toCharArray();


        for ( char ltr : chars) {
            if (isVowel(ltr)) {
                vowels.add(ltr);
            } else {
                consonants.add(ltr);
            }
        }

        for ( Character ltr : vowels) {
            System.out.print(ltr + " ");
        }
        System.out.println(" ");

        for (Character ltr : consonants) {
            System.out.print(ltr + " ");
        }





    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}