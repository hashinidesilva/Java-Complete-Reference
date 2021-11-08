package com.hashini.multithreading.interthreadcommunication;

public class Consumer implements Runnable {
    Queue queue;

    Consumer(Queue q) {
        queue = q;
        Thread thread = new Thread(this, "Consumer");
        thread.start();
    }

    public void run() {
        while (true) {
            queue.get();
        }
    }
}