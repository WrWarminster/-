package com.company;

import java.util.Scanner;

public class CW32_1 {

    public static void textLength(String s) {
        System.out.println("В вашей строке " + s.length() + " букв");
    }
    public static void textHash(String s) {
        System.out.println("Хеш для вашей строки " + s.hashCode());
    }
    public static void textReverse(String s) {
        System.out.println("Наоборот ваша строка будет читаться: " + new StringBuilder(s).reverse());
    }

    public static void textSBE(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер буквы, с которой хотите прочитать строку, не превышающий диапазон от нуля до " + s.length() + " : ");
        String number1 = sc.nextLine();
        int number11 = Integer.parseInt(number1);

        System.out.println("Введите номер буквы, до которой хотите прочитать строку, не превышающий диапазон от 0 до " + s.length() + " : ");
        String number2 = sc.nextLine();
        int number22 = Integer.parseInt(number2);

        System.out.println("Ваша новая полученная строка " + s.substring(number11, number22));
    }
    public static void Error () {
        System.out.println("Операция не распознана");
    }

    public static void main(String[] args) {
        String exit;
        exit = "0";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любой текст (для выхода введите exit) :");
        String text = sc.nextLine();

        while (exit.equals("exit") == false) {
            System.out.println("Введите одну из команд: length, hash, reverse, sbe :");
            String str = sc.nextLine();

            switch (str) {
                case "length":
                    textLength(text);
                    break;
                case "hash":
                    textHash(text);
                    break;
                case "reverse":
                    textReverse(text);
                    break;
                case "sbe":
                    textSBE(text);
                    break;
                default:
                    Error();
            }
            System.out.println("Если вы хотите выйти, введите exit, для продолжения нажмите enter");
            String s = sc.nextLine();

            if (s.equals("exit") == true) {
                exit = "exit";
            }

        }

    }
}
