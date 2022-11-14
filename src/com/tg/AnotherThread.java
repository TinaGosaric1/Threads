package com.tg;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from the thread 2.");
    }
}
