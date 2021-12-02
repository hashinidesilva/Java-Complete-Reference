package com.hashini.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("A");
        ll.add("E");
        ll.add("G");
        ll.add("Q");
        ll.addFirst("P");
        ll.addLast("C");
        ll.add(1, "A2");

        System.out.println("Contents of linked list " + ll);

        ll.remove("G");
        ll.remove(1);

        System.out.println("Contents of linked list after deletion " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("Contents of linked list after deleting first and last elements " + ll);

        String val = ll.get(0);
        ll.set(0, val + " changed");

        System.out.println("Contents of linked list after change " + ll);

    }
}