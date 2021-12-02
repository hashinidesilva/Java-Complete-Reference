package com.hashini.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("C");
        ts.add("W");
        ts.add("L");
        ts.add("V");
        ts.add("A");

        System.out.println(ts);
    }
}