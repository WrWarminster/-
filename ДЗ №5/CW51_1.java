package com.company;

import java.util.Scanner;

public class CW51_1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i <= array.length; i++) {
            Scanner sc = new Scanner(System.in);
            String s;

                System.out.print("Введите число для добавление его в массив: ");
                s = sc.nextLine();
                try {
                    array[i] = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    System.out.println("Сообщение: " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Сообщение: В массиве предел равен " + e.getMessage());
                }


        }
            }

}



