package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] strArray = new String[] {"f","h","h","t","p","s","h","l","y","n","x","u","a","s","q"};
        System.out.println("Созданный массив перед сортировкой: ");
        System.out.println(Arrays.toString(strArray));

        System.out.println("Созданный массив после сортировки: ");
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        System.out.println("Обновлённый массив: ");
        String[] strArray2 = new String[10];
        for (int i = 0; i<strArray2.length; i++){
                if (i<5) {
                    strArray2[i] = strArray[i];
            } else {
                    strArray2[i] = strArray[i+5];
                }
        }
        System.out.println(Arrays.toString(strArray2));


    }
}
