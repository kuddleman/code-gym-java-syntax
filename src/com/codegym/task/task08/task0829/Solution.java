package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            addresses.put(city, family);
        }


        String city = reader.readLine();

        if (addresses.containsKey(city)) {
            String familyName = addresses.get(city);
            System.out.println(familyName);
        }




        // List of addresses
//        List<String> addresses = new ArrayList<>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }

        // Read the house number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familyName = addresses.get(houseNumber);
//            System.out.println(familyName);
//        }
    }


}
