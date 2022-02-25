package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] numbersArray1 = new int[5];
        int[] numbersArray2 = new int[5];

        for(int i = 0; i<numbersArray1.length; i++){
            numbersArray1[i] = new Random().nextInt(10);
            numbersArray2[i] = new Random().nextInt(10);
        }

        System.out.println("Массив №1 :");
        System.out.println(Arrays.toString(numbersArray1));
        System.out.println("Массив №2 :");
        System.out.println(Arrays.toString(numbersArray2));

        for(int j = 0; j<numbersArray1.length; j++){
            for(int h = 0; h<numbersArray1.length; h++){
                if (numbersArray1[j] != numbersArray2[h]) {
                    System.out.println("Элемент " + (int)(j+1) + " массива №1 отличается от элемента " + (int)(h+1) + " массива №2");
                }
            }
        }
    }
}
