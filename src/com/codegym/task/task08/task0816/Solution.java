package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stall", df.parse("MAY 14 1980"));
        map.put("Stalloned", df.parse("JANUARY 14 1980"));
        map.put("Stallonedf", df.parse("JULY 1 1980"));
        map.put("Stallonessss", df.parse("FEBRUARY 13 1980"));
        map.put("Stallonesdfdfd", df.parse("SEPTEMBER 1 1980"));
        map.put("Stallonezz", df.parse("AUGUST 1 1980"));
        map.put("Stallonemm", df.parse("JUNE 7 1980"));
        map.put("Stallonetyu", df.parse("NOVEMBER 1 1980"));
        map.put("Stalloneq", df.parse("JUNE 18 1980"));

        //write your code here
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here
        HashMap<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }

        }


    }

    public static void main(String[] args) {

    }
}
