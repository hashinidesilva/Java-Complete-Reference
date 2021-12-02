package com.hashini.collections;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("A", new Double(1.3));
        tm.put("K", new Double(1.2));
        tm.put("E", new Double(1.4));
        tm.put("D", new Double(1.5));

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = tm.get("E");
        tm.put("E", balance + 1000);

        System.out.println("New E: " + tm.get("E"));
    }
}