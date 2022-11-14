package com.tg;

import static com.tg.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "AnotherThread woke me up.");
            return;
        }

        System.out.println(ANSI_BLUE + "Five seconds have passed and I'm awake.");
    }
}
