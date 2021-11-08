package com.hashini.multithreading.interthreadcommunication;

public class Producer implements Runnable {
    Queue queue;

    Producer(Queue q) {
        queue = q;
        Thread thread = new Thread(this, "Producer");
        thread.start();
    }

    public void run() {
        int i = 0;

        while (true) {
            queue.put(i++);
        }
    }
}
