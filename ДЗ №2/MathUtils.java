package com.company;

import java.util.Scanner;

public class MathUtils {
    public static void summa(int a, int b) {
        int summa = a + b;
        System.out.println("Сумма чисел " + a + " и " + b + " = " + summa);
    }
    public static void minus(int a, int b) {
        int minus = a - b;
        System.out.println("Разность чисел " + a + " и " + b + " = " + minus);
    }
    public static void comp(int a, int b) {
        int comp = a * b;
        System.out.println("Произведение чисел " + a + " и " + b + " = " + comp);
    }
    public static void priv(int a, int b) {
        int priv = a / b;
        System.out.println("Частное чисел " + a + " и " + b + " = " + priv);
    }
    public static void Const(int a, int b) {
        double с = Math.pow(a, b);
        System.out.println("Возведение числа " + a + " в " + b + " степень = " + с);
    }
    public static void factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа " + a + " = " + result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число №1:");
        String number1 = sc.nextLine();
        int result1 = Integer.parseInt(number1);

        System.out.println("Введите число №2:");
        String number2 = sc.nextLine();
        int result2 = Integer.parseInt(number2);

        MathUtils.summa(result1,result2);
        MathUtils.minus(result1,result2);
        MathUtils.comp(result1,result2);
        MathUtils.priv(result1,result2);
        MathUtils.Const(result1,result2);
        MathUtils.Const(result2,result1);
        MathUtils.factorial(result1);
        MathUtils.factorial(result2);

    }
}
