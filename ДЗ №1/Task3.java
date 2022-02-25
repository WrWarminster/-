package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
     double A = 1.2; //начало отрезка
     double B = 5.7; //конец отрезка

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое хотели бы проверить:");
        String number = sc.nextLine();
        double result = Double.parseDouble(number);

        otrezokProverka(A, B, result);

    }
    static void otrezokProverka(double a, double b,double result ){
      if (result >= a && result <= b) {
          System.out.println("Число " + result + " принадлежит отрезку");
        } else {
          System.out.println("Число " + result + " не принадлежит отрезку");
      }
    }

}
