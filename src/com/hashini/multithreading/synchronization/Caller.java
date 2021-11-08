package com.hashini.multithreading.synchronization;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
