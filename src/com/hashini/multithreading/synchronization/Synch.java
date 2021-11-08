package com.hashini.multithreading.synchronization;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller caller1 = new Caller(target, "Hello");
        Caller caller2 = new Caller(target, "Synchronized");
        Caller caller3 = new Caller(target, "World!");

        try {
            caller1.t.join();
            caller2.t.join();
            caller3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
