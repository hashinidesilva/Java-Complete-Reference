package com.hashini.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Ant");
        hs.add("Dog");
        hs.add("Elephant");
        hs.add("Lion");
        hs.add("Bat");

        System.out.println(hs);
    }
}