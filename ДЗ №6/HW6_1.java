package com.company;

import java.math.BigInteger;

public class HW6_1 {
    static class MyThread extends Thread {
        int sum = 0;
        @Override
        public void run() {
            long time = System.currentTimeMillis();
            for (int i=3000000; i<=6000000; i++) {
                BigInteger bigInteger = BigInteger.valueOf(i);
                boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
                if (probablePrime) {
                    sum++;
                }

            }
            System.out.println("Кол-во простых чисел: " + sum);
            System.out.println("Время выполнения программы " + (System.currentTimeMillis()- time) + " мс");
        }
    }
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }

}
