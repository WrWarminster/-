package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double averageScore;
    Student (String a, int b, double c) {
        this.name = a;
        this.age = b;
        this.averageScore = c;
    }
    String getName () {
        return name;
    }
    int getAge () {
        return age;
    }
    double getAverageScore() {
        return averageScore;
    }
}

public class CW4_1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        String ans;
        ans = "y";
        int k = 0;
        double сheck = 0;

        while (!ans.equals("n")) {
            k++;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя студента:");
            String names = sc.nextLine();
            System.out.println("Введите возраст студента:");
            String ages = sc.nextLine();
            int newAges = Integer.parseInt(ages);
            System.out.println("Введите среднее значение студента (от 0.0 до 10.0):");
            String score = sc.nextLine();
            double newScore = Double.parseDouble(score);

            students.add(new Student(names, newAges, newScore));

            System.out.println("Чтобы продолжить, выберите y/n?");
            do {
                ans = sc.nextLine();
                if (ans.equals("y") == false && ans.equals("n") == false) {
                    System.out.println("Неверный запрос, чтобы продолжить, выберите y/n?");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);
        }

        for (Student i: students) {
            if (i.getAverageScore() > сheck) {
                сheck = i.getAverageScore();
            }
        }

        for (Student i: students) {
            if (i.getAverageScore() == сheck) {
                System.out.println("Студент с наивысшим средним баллом:");
                System.out.println("Имя: " + i.getName());
                System.out.println("Возраст: " + i.getAge());
                System.out.println("Средний бал: " + i.getAverageScore());
            }
        }

    }
}
