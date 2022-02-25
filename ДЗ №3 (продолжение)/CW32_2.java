package com.company;

import java.util.Scanner;

public class CW32_2 {
    public static void main(String[] args) {
        String ans = "y";
        int i = 0;
        StringBuilder str = new StringBuilder();

        while (!ans.equals("n")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите любой текст:");
            String text = sc.nextLine();
            i = i + 1;

            str.append(text + " ");

            System.out.println("Чтобы продолжить, выберите y/n?");
            do {
                ans = sc.nextLine();
                if (ans.equals("y") == false && ans.equals("n") == false) {
                    System.out.println("Неверный запрос, чтобы продолжить, выберите y/n?");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);
        }

        System.out.println("Получившаяся строка: " + str.toString());
        System.out.println("Кол-во букв в введённой строке (длина строки с кол-вом пробелов): " + str.length());
        System.out.println("Кол-во вводов: " + i);

    }
}

