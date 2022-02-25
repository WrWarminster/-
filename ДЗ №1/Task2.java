package com.company;

public class Task2 {
    public static void main(String[] args) {
      int a = 4;
      int b = 5;
      int c = 6;
      int R = 12;
      int h = 4;
      int r = 2;

        ParallelepipedV(a,b,c);
        BallV(R);
        CylinderV(r,h);

    }
    static void ParallelepipedV(int a, int b, int c) {
        int Vp = a*b*c;
        System.out.println("Объём параллелепипеда: " + Vp);
    }
    static void BallV(int R) {
        double Vb = (4*3.14*Math.pow(R,3))/3;
        System.out.println("Объём шара: " + Vb);
    }
    static void CylinderV(int r, int h) {
        double Vc = 3.14*Math.pow(r,2)*h ;
        System.out.println("Объём цилиндра: " + Vc);
    }
}
