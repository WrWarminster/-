package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PlanetS {
    private double distanceToSun;
    private double mass;
    private double diameter;

    PlanetS(double a, double b, double c) {
        this.distanceToSun = a;
        this.mass = b;
        this.diameter = c;

    }

    double getDistanceToSun2() {
        return distanceToSun;
    }
    double getMass2() {
        return mass;
    }
    double getDiameter2() {
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

public class HW4_2 {
    public static void main(String[] args) {
        boolean check = false;

        ArrayList<Integer> newPlanets = new ArrayList<>();
        Map<String,ArrayList<Integer>> planets = new HashMap<>();

        newPlanets.add(123000);
        newPlanets.add(217379);
        newPlanets.add(821837);
        planets.put("Земля", newPlanets);

        newPlanets.add(new PlanetS(176500, 100900, 1235433));
        planets.put("Юпитер", newPlanets);

        newPlanets.add(new PlanetS(2398000, 336900, 12965700));
        planets.put("Марс", newPlanets);

        newPlanets.add(new PlanetS(123045, 1023900, 2753003));
        planets.put("Сатурн", newPlanets);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название планеты (Земля, Юпитер, Марс, Сатурн), чтобы получить о ней информацию:");
        String newPlanet = sc.nextLine();

        for (String key : planets.keySet()) {
            if (newPlanet.equals(key)) {
                check = true;
                    System.out.println("Вы ввели планету: " + key);
                    System.out.println("Дистанция до солнца: " + planets.get(key).get(3).getDistanceToSun2());
                    System.out.println("Масса: " + planets.get(key).get(3).getMass2());
                    System.out.println("Диаметр: " + planets.get(key).get(3).getDiameter2());
            }
        }
        if (!check){
            System.out.println("Такой планеты нет в списке");
        }
    }
}
