package com.codegym.task.task10.task1015;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String>[] myList = (ArrayList<String>[]) new ArrayList[3];

        myList [0] = new ArrayList<String>();
        myList [1] = new ArrayList<String>();
        myList [2] = new ArrayList<String>();

        myList [0].add("Hi");
        myList [1].add("this");
        myList [2].add("is");

        return myList ;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}