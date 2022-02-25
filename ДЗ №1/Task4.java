package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        double A = 1.2; //начало отрезка
        double B = 5.7; //конец отрезка
        String ans;
        ans = "y";

        while (ans.equals("n") == false) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число, которое хотели бы проверить:");
            String number = sc.nextLine();
            double result = Double.parseDouble(number);

            otrezokProverka(A, B, result);

            System.out.println("Чтобы продолжить, выберите y/n?");
            do {
                ans = sc.nextLine();
                if (ans.equals("y") == false && ans.equals("n") == false) {
                    System.out.println("Неверный запрос, чтобы продолжить, выберите y/n?");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);

        }
    }
    static void otrezokProverka(double a, double b,double result ){
        if (result >= a && result <= b) {
            System.out.println("Число " + result + " принадлежит отрезку");
        } else {
            System.out.println("Число " + result + " не принадлежит отрезку");
        }
    }

}

