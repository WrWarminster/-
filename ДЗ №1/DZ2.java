package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class DZ2 {

    public static void main(String[] args) {
        boolean cheak;
        cheak = false;
        String[] nameArray = new String[] {"Maria","Vladimir","Vasiliy","Belle","Kate"};
        System.out.println(Arrays.toString(nameArray));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = sc.nextLine();

        for (int i = 0; i<nameArray.length; i++) {
            if (name.equals(nameArray[i])) {
                cheak = true;
                break;
            }
        }
        if (cheak) {
            System.out.println("Введённое имя присутствует в массиве");
        }else{
            System.out.println("Введённое имя отсутствует в массиве");
        }

    }

}
