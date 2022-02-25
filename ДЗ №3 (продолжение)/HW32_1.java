package com.company;

import java.util.Scanner;

public class HW32_1 {
    public static void main(String[] args) {
        int f = 0;
        int k = 0;
        String h = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любую строку:");
        String text = sc.nextLine();

        String str = text;
        String[] myString = str.split(" ");

        for (int i = 0; i< myString.length; i++) {
            k = k + myString[i].length();
            if (myString[i].length()>f) {
                f = myString[i].length();
                h = myString[i];
            }
        }

        System.out.println("Кол-во слов в строке: " + myString.length);
        System.out.println("Число символов в строке без пробелов: " + k);
        System.out.println("Самое длинное слово в строке: " + h);
    }
}
