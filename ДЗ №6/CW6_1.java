package com.company;

import java.util.Date;

public class CW6_1 {

    static class SomeTask implements Runnable {
        public void run() {
            Date currentDate = new Date();
            System.out.println("Date currentDate =  " + currentDate);
            System.out.println("Я поток реализованный с помощью интерфейса Runnable");
        }
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            Date currentDate = new Date();
            System.out.println("Date currentDate =  " + currentDate);
            System.out.println("Я поток реализованный с помощью класса Thread ");
        }
    }
    public static void main(String[] args) {
        Thread s = new Thread(new SomeTask());
        s.start();
        Thread t = new MyThread();
        t.start();
    }
}
