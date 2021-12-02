package com.hashini.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Initial size of array list " + al.size());

        al.add("A");
        al.add("E");
        al.add("W");
        al.add(1, "P");

        System.out.println("Size odf array list after additions " + al.size());

        System.out.println("Contents of array list " + al);

        al.remove("E");
        al.remove(2);

        System.out.println("Size of array list after deletion " + al.size());

        System.out.println("Contents of array list " + al);

        ArrayList<Integer> intArrayList = new ArrayList<>();

        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);

        System.out.println("Contents of integer array list " + intArrayList);

        Integer[] stringArray = new Integer[intArrayList.size()];
        stringArray = intArrayList.toArray(stringArray);

        int sum = 0;

        for (int i : stringArray) sum += i;

        System.out.println("Sum = " + sum);

    }
}