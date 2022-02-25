package com.company;

import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        String ans;
        ans = "y";
        while (!ans.equals("n")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите целочисленное значение №1");
            String number1 = sc.nextLine();
            int result1 = Integer.parseInt(number1);
            System.out.println("Введите целочисленное значение №2");
            String number2 = sc.nextLine();
            int result2 = Integer.parseInt(number2);

            System.out.println("Какое вычисление хотите произвести?(сложение, вычитание, умножение или деление)");
            String str = sc.nextLine();

            switch (str) {
                case "сложение":
                    Summa(result1, result2);
                    break;
                case "вычитание":
                    Minus(result1, result2);
                    break;
                case "умножение":
                    Proizv(result1, result2);
                    break;
                case "деление":
                    Del(result1, result2);
                    break;
                default:
                    Error();

            }

            System.out.println("Чтобы продолжить, выберите y/n?");
            do {
                ans = sc.nextLine();
                if (ans.equals("y") == false && ans.equals("n") == false) {
                    System.out.println("Неверный запрос, чтобы продолжить, выберите y/n?");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);
        }
    }

            public static void Summa ( int A, int B){
                int C = A + B;
                System.out.println("Вывод:" + C);
            }
            public static void Minus ( int A, int B){
                int C = A - B;
                System.out.println("Вывод:" + C);
            }
            public static void Proizv ( int A, int B){
                int C = A * B;
                System.out.println("Вывод:" + C);
            }
            public static void Del( int A, int B){
                double C = A / B;
                System.out.println("Вывод:" + C);
            }
            public static void Error () {
                System.out.println("Операция не распознана");
            }

    }
