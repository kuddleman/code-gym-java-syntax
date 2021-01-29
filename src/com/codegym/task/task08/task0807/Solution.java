package com.codegym.task.task08.task0807;

import java.util.*;

/* 
LinkedList and ArrayList

*/

public class Solution {
    public static Object createArrayList() {
        //write your code here
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(5);
        myArrayList.add(7);
        myArrayList.add(10);

        return myArrayList;
    }

    public static Object createLinkedList() {
        //write your code here
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(12);
        myLinkedList.add(16);
        myLinkedList.add(234);

        return myLinkedList;
    }

    public static void main(String[] args) {

    }
}
