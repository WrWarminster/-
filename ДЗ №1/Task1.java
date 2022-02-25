package com.company;

public class Task1 {

    public static void main(String[] args) {
        String str1 = "9";
        String str2 = "10";

        int number1 = Integer.parseInt(str1);
        double number2 = Double.parseDouble(str2);
        int result = number1 + (int)number2;

        System.out.println(result);
    }

}
