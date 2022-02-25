package com.company;

import java.util.Scanner;

public class Roots {
    double x1;
    double x2;
    int roots;


    public static Roots getRoots() {
       double x1 = 0;
       double x2 = 0;
       int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффициент a:");
        String number1 = sc.nextLine();
        double a = Double.parseDouble(number1);

        System.out.println("Введите коэффициент b:");
        String number2 = sc.nextLine();
        double b = Double.parseDouble(number2);

        System.out.println("Введите коэффициент c:");
        String number3 = sc.nextLine();
        double c = Double.parseDouble(number3);

        double D = Math.pow(b,2) - 4*a*c;
        if (D>0) {
            count = 2;
            x1 = (-b - Math.sqrt(D))/(2*a);
            x2 = (-b + Math.sqrt(D))/(2*a);
        } if (D == 0) {
            count = 1;
            x1 = (-b)/(2*a);
        }

        Roots root = new Roots();
        root.x1 = x1;
        root.x2 = x2;
        root.roots = count;
        return root;

    }

    public static void main(String[] args) {
        Roots Root = new Roots();
        Root = getRoots();

        System.out.println("Корней = " + Root.roots);
        if (Root.roots == 2) {
            System.out.println("X1 = " + Root.x1);
            System.out.println("X2 = " + Root.x2);
        } if (Root.roots == 1) {
            System.out.println("X = " + Root.x1);
        }

    }
}



