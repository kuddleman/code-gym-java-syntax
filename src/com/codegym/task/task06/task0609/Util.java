package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
         double result = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
         return result;
    }

    public static void main(String[] args) {

    }
}
