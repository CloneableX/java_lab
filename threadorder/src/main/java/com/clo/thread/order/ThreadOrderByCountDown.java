package com.clo.thread.order;

import java.util.concurrent.CountDownLatch;

public class ThreadOrderByCountDown {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(3);

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("thread 1");
                countDownLatch.countDown();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("thread 2");
                countDownLatch.countDown();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("thread 3");
                countDownLatch.countDown();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        countDownLatch.await();
        System.out.println("main thread");
    }
}
