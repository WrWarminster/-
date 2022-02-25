package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Planet {
    private double distanceToSun;
    private double mass;
    private double diameter;

    Planet(double a, double b, double c) {
        this.distanceToSun = a;
        this.mass = b;
        this.diameter = c;
    }

    double getDistanceToSun() {
        return distanceToSun;
    }
    double getMass() {
        return mass;
    }
    double getDiameter() {
        return diameter;
    }
    void setDistanceToSun(double a) {
        this.distanceToSun = a;
    }
    void setMass(double b) {
        this.mass = b;
    }
    void setDiameter(double c) {
        this.diameter = c;
    }
}
public class HW4_1 {
    public static void main(String[] args) {
        boolean check = false;
        Map<String,Planet> planets = new HashMap<>();
        planets.put("Земля", new Planet(123000, 126900, 1293333));
        planets.put("Уран", new Planet(176500, 100900, 1235433));
        planets.put("Марс", new Planet(2398000, 336900, 12965700));
        planets.put("Сатурн", new Planet(12302345, 1023900, 2753003));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название планеты (Земля, Юпитер, Марс, Сатурн), чтобы получить о ней информацию:");
        String newPlanet = sc.nextLine();


        for (String key : planets.keySet()) {
            if (newPlanet.equals(key)) {
                check = true;
                System.out.println("Вы ввели планету: " + key);
                System.out.println("Дистанция до солнца: " + planets.get(key).getDistanceToSun() );
                System.out.println("Масса: " + planets.get(key).getMass());
                System.out.println("Диаметр: " + planets.get(key).getDiameter());
            }
        }
        if (!check){
            System.out.println("Такой планеты нет в списке");
        }
    }
}
