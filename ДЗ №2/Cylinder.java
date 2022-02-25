package com.company;

public class Cylinder {
    protected void S (int h, int r) {
        double s = (double)(2*3.14*r*h + 2*3.14*Math.pow(r, 2));
        System.out.println("Площадь поверхности цилиндра = " + s);
    }
    protected void V (int H, int R) {
        double v = (double)(3.14*Math.pow(R, 2)*H);
        System.out.println("Площадь поверхности цилиндра = " + v);
    }

    protected void S (double h, double r) {
        double s = (double)(2*3.14*r*h + 2*3.14*Math.pow(r, 2));
        System.out.println("Площадь поверхности цилиндра = " + s);
    }
    protected void V (double H, double R) {
        double v = (double)(3.14*Math.pow(R, 2)*H);
        System.out.println("Площадь поверхности цилиндра = " + v);
    }

    protected void S (String number1, String number2) {
        double h = Double.parseDouble(number1);
        double r = Double.parseDouble(number2);
        double s = (double)(2*3.14*r*h + 2*3.14*Math.pow(r, 2));
        System.out.println("Площадь поверхности цилиндра = " + s);
    }
    protected void V (String number1, String number2) {
        double H = Double.parseDouble(number1);
        double R = Double.parseDouble(number2);
        double v = (double)(3.14*Math.pow(R, 2)*H);
        System.out.println("Площадь поверхности цилиндра = " + v);
    }
}
