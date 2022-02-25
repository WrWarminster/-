package com.company;

import java.util.Scanner;

public class A {

    protected void show(){
        System.out.println("Класс A:");
    }

    protected void count(int a, int b) {
        int summa = a + b;
        System.out.println("Сумма чисел " + a + " и " + b + " = " + summa);
    }
    public static  void main(String[] args) {

        A a = new A();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число №1:");
        String number1 = sc.nextLine();
        int result1 = Integer.parseInt(number1);

        System.out.println("Введите число №2:");
        String number2 = sc.nextLine();
        int result2 = Integer.parseInt(number2);

        a.show();
        a.count(result1, result2);

        B b = new B();

        b.show();
        b.count(result1, result2);

        C c = new C();

        c.show();
        c.count(result1, result2);

        D d = new D();

        d.show();
        d.count(result1, result2);

    }

}

class B extends A {
    protected void show(){
        System.out.println("Класс B:");
    }

    protected void count(int a, int b) {
        int minus = a - b;
        System.out.println("Разность чисел " + a + " и " + b + " = " + minus);
    }
}

class C extends A {
    protected void show(){
        System.out.println("Класс C:");
    }

    protected void count(int a, int b) {
        int comp = a * b;
        System.out.println("Произведение чисел " + a + " и " + b + " = " + comp);
    }
}

class D extends B {
    protected void show(){
        System.out.println("Класс D:");
    }

    protected void count(int a, int b) {
        int priv = a / b;
        System.out.println("Частное чисел " + a + " и " + b + " = " + priv);
    }
}



