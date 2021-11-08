package com.hashini.multithreading;

class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread:" + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting");
    }
}

public class MultiThreadDemo {

    public static void main(String[] args) {
        NewThread3 ob1 = new NewThread3("One");
        NewThread3 ob2 = new NewThread3("Two");
        NewThread3 ob3 = new NewThread3("Three");

        System.out.println("Thread One is alive:" + ob1.t.isAlive());
        System.out.println("Thread Two is alive:" + ob2.t.isAlive());
        System.out.println("Thread Three is alive:" + ob3.t.isAlive());

        try {
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread One is alive:" + ob1.t.isAlive());
        System.out.println("Thread Two is alive:" + ob2.t.isAlive());
        System.out.println("Thread Three is alive:" + ob3.t.isAlive());

        System.out.println("Main thread exiting");
    }
}
