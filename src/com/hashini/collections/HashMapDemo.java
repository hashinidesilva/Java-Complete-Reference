package com.hashini.collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("A", new Double(1.3));
        hm.put("K", new Double(1.2));
        hm.put("E", new Double(1.4));
        hm.put("D", new Double(1.5));

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = hm.get("E");
        hm.put("E", balance + 1000);

        System.out.println("New E: " + hm.get("E"));
    }
}