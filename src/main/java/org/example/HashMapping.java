package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapping {
    public static void main(String[] args) {

        Map<Integer, String> newMap = new HashMap<>();


        newMap.put(1, "Peter");
        newMap.put(2, "Hamza");
        newMap.put(3, "Hamza");
        newMap.put(4, "PHJAMES");

        System.out.println(newMap);

//        Map<Integer, String> newMap4 = new HashMap<>();
//
//        for (Map.Entry<Integer, String> map : newMap.entrySet()){
//                if(!newMap4.containsValue(map.getValue())){
//
//                    newMap4.put(map.getKey(), map.getValue());
//
//
//                }
//        }
//        for (Map.Entry<Integer, String> map1 : newMap4.entrySet()){
//            System.out.println(map1);
//        }
//


    }
}