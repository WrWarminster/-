package com.company;

import java.util.Scanner;

interface Fruit {
    String getName();
    Double getWeight();
    boolean isTasty(String taste);
}

class Orange implements Fruit {

    public String getName() {
        return ("Это апельсин");
    }
    public Double getWeight() {
        Scanner fruitWeight = new Scanner(System.in);
        return fruitWeight.nextDouble();
    }

    public boolean isTasty(String taste) {
        if (taste.equals("Апельсин")) {
            return true;
        } else {
            return false;
        }
    }
}

class Banana implements Fruit {
    public String getName() {
        return ("Это банан");
    }
    public Double getWeight() {
        Scanner fruitWeight = new Scanner(System.in);
        return fruitWeight.nextDouble();
    }

    public boolean isTasty(String taste) {
        if (taste.equals("Банан")) {
            return true;
        } else {
            return false;
        }
    }

}

class Apple implements Fruit {

    public  String getName() {
        return ("Это яблоко");
    }
    public  Double getWeight() {
        Scanner fruitWeight = new Scanner(System.in);
        return fruitWeight.nextDouble();
    }


    public  boolean isTasty(String taste) {
        if (taste.equals("Яблоко")) {
            return true;
        } else {
            return false;
        }
    }

}

public class CW3_1 {
    public static void main(String[] args) {
        Apple apple = new Apple();
         System.out.println(apple.getName() + " " + apple.getWeight() + " " + apple.isTasty("Яблоко"));
    }
}
