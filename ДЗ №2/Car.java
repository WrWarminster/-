package com.company;

import java.util.Scanner;

public class Car {
     String model; //Модель машины
     int maxSpeed; //Скорость в км/ч
     int weight; //Вес в кг

     Car(int carSpeed, int carWeight) {
        this.maxSpeed = carSpeed;
        this.weight = carWeight;
    }
     Car(int carSpeed) {
        this.maxSpeed = carSpeed;
    }
     Car(String carModel, int carSpeed, int carWeight) {
        this.model = carModel;
        this.maxSpeed = carSpeed;
        this.weight = carWeight;
    }

    public void show() {
        if (model != null) {
            System.out.println("Модель машины: " + model);
        }
        if (maxSpeed != 0) {
            System.out.println("Максимальная скорость машины: " + maxSpeed);
        }
        if (weight != 0) {
            System.out.println("Вес машины: " + weight);
        }
    }

    public static  void main(String[] args) {

        String ans;
        ans = "y";

        while (!ans.equals("n")) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите модель машины:");
            String model = sc.nextLine();

            System.out.println("Введите скорость машины:");
            String result1 = sc.nextLine();
            int speed = Integer.parseInt(result1);

            System.out.println("Введите вес машины:");
            String result2 = sc.nextLine();
            int weigth = Integer.parseInt(result2);
             
           

            Car car = new Car(model, speed, weigth);
            System.out.println("Информация о машине:");
            car.show();

            System.out.println("Чтобы продолжить, выберите y/n?");
            do {
                ans = sc.nextLine();
                if (ans.equals("y") == false && ans.equals("n") == false) {
                    System.out.println("Неверный запрос, чтобы продолжить, выберите y/n?");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);

        }
    }
}


