package com.company;

public class HW32_2 {
    public static void main(String[] args) {

        long k = System.currentTimeMillis();
        String str = "some string";
        for (int i=0; i <=20000; i++) {
            str += "new string";
        }
        long t = System.currentTimeMillis();

        long i = t - k;
        System.out.println("Время выполнения конкатерации: " + i);

        k = System.currentTimeMillis();
        StringBuilder text = new StringBuilder();
        for (int j=0; j <=20000; j++) {
            text.append("new string");
        }
        t = System.currentTimeMillis();

        long f = t - k;
        System.out.println("Время выполнения конкатерации со StringBuilder: " + f);
    }
}
