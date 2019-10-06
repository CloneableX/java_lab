package com.clo.thread.order;

public class ThreadOrderByJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("thread 1");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("thread 2");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("thread 3");
            }
        });

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();

        System.out.println("main thread");
    }
}
