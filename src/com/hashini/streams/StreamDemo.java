package com.hashini.streams;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(7);
        myList.add(21);
        myList.add(38);
        myList.add(3);
        myList.add(15);

        System.out.println("Original List : " + myList);

        Stream<Integer> myStream = myList.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) System.out.println("Minimum value : " + minVal.get());

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) System.out.println("Maximum value : " + maxVal.get());

        Stream<Integer> sortedStream = myList.stream().sorted();

        System.out.print("Sorted Stream: ");
        sortedStream.forEach((item) -> System.out.print(item + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter((item) -> item % 2 == 1);

        System.out.print("Odd Values : ");
        oddVals.forEach((item) -> System.out.print(item + " "));
        System.out.println();

        oddVals = myList.stream().sorted().filter((item) -> item % 2 == 1).filter((item) -> item > 5);

        System.out.print("Odd Values greater than 5 : ");
        oddVals.forEach((item) -> System.out.print(item + " "));
        System.out.println();
    }
}