package com.tg;

import static com.tg.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the thread 1.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();
//        Using a subclass of thread means that we have to define the run method once, but we can't reuse the same instance.
//        anotherThread.start();

        new Thread() { // anonymous class
            public void run() { // we have to implement the run method, but we don't call it directly - we call the start() method instead
                System.out.println(ANSI_GREEN + "Hello from anonymous class tread.");
            }
        }.start();

        // anonymous class implementing MyRunnable class
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "Hello from the anonymous class implementing MyRunnable class.");
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello again from the thread 1.");
    }
}