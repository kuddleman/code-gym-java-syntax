package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> newList = new ArrayList<>();
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {8, 9};
        int[] list3 = {7, 9, 12, 89};
        int[] list4 = {67, 45, 6, 123, 57, 142, 789};
        int[] list5 = {};

        newList.add(list1);
        newList.add(list2);
        newList.add(list3);
        newList.add(list4);
        newList.add(list5);

        return newList;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
