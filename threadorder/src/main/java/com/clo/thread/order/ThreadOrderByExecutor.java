package com.clo.thread.order;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadOrderByExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
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

        executor.submit(thread1);
        executor.submit(thread2);
        executor.submit(thread3);

        executor.shutdown();
        while (true) {
            if (executor.isTerminated()) {
                System.out.println("main thread");
                break;
            }

            Thread.sleep(200);
        }
    }
}
