package com.tg;

import static com.tg.ThreadColor.ANSI_GREEN;
import static com.tg.ThreadColor.ANSI_PURPLE;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the thread 1.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();
//        Using a subclass of thread means that we have to define the run method once, but we can't reuse the same instance.
//        anotherThread.start();

        new Thread() { // anonymous class
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from anonymous class tread.");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable()); // with Runnable interface
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the thread 1.");
    }
}