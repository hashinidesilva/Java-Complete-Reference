package com.hashini.streams;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(1);
        myList.add(4);
        myList.add(6);
        myList.add(3);
        myList.add(5);

        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if (productObj.isPresent()) System.out.println("Product as Optional : " + productObj.get());

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product as int : " + product);
    }
}