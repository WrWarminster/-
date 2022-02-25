package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class HW6_2 {
    public static void main(String[] args) {
        int s = (-1);

            Scanner sc = new Scanner(System.in);
            System.out.print("Введите кол-во потоков n = от 2 до 10 : ");
            String nText = sc.nextLine();
            int n = Integer.parseInt(nText);

        long time = System.currentTimeMillis();
            Thread[] t = new Thread[n];
            for (int i = 0; i < n; i++) {
               int k = (3000000/n);
               s = s + 1;
                t[i] = new Thread(new MyThreads(k,s));
                t[i].start();
            }

            for (int i = 0; i < n; i++) {
                try {
                    t[i].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            System.out.println("Время выполнения всей программы " + (System.currentTimeMillis() - time) + " мс");

    }
    static class MyThreads extends Thread {
        int sum = 0;
         int k;
         int s;
         int t = 3000000;
        public MyThreads(int k, int s) {
            this.k = k;
            this.s = s;
        }
        @Override
        public void run() {
            t = t + k*(s+1);
            long time = System.currentTimeMillis();
            for (int i=(3000000 + k*s); i<=t; i++) {
                BigInteger bigInteger = BigInteger.valueOf(i);
                boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
                if (probablePrime) {
                    sum++;
                }

            }
            System.out.println("Кол-во простых чисел от " + (3000000+k*s) + " до " + t + " : "  + sum);
            System.out.println("Время выполнения программы " + (System.currentTimeMillis() - time) + " мс");

        }
        }
    }

