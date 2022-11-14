package com.tg;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the thread 1.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();
//        Using a subclass of thread means that we have to define the run method once but we can't reuse the same instance.
//        anotherThread.start();

        System.out.println("Hello again from the thread 1.");
    }
}