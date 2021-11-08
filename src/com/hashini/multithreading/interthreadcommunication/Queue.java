package com.hashini.multithreading.interthreadcommunication;

public class Queue {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception occurred");
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception Occurred");
            }
        }
        this.n = n;
        valueSet = true;
        notify();
        System.out.println("Put: " + n);
    }
}
