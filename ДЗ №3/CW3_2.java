package com.company;

class Params{
        double a;
        double b;
        double r;

        Params(int a, int b, int r) {
            this.a = a;
            this.b = b;
            this.r = r;
        }

}
interface Ffigure {
    String getFigureName();
    double getPerimeter(Params p);
    double getSquare(Params p);
    default void show(Params p) {
    }
}

class Circlle implements Ffigure {

    @Override
    public String getFigureName() {
        return ("Круг");
    }

    @Override
    public double getPerimeter(Params p) {
        return (2*3.14*p.r);
    }

    @Override
    public double getSquare(Params p) {
        return (3.14*Math.pow(p.r,2));
    }
    @Override
    public void show(Params p) {
        System.out.println("Имя фигуры: " + getFigureName());
        System.out.println("Периметр фигуры: " + getPerimeter(p));
        System.out.println("Площадь фигуры: " + getSquare(p));

    }

}

abstract class Quadrangle implements Ffigure {
    @Override
    public String getFigureName() {
        return ("Квадрат");
    }

    public double getSquare(Params p) {
        return 0;
    }

    @Override
    public double getPerimeter(Params p) {
        return 0;
    }

    @Override
    public void show(Params p) {
        System.out.println("Имя фигуры: " + getFigureName());
        System.out.println("Периметр фигуры: " + getPerimeter(p));
        System.out.println("Площадь фигуры: " + getSquare(p));

    }
}

class Square extends Quadrangle {

    @Override
    public double getSquare(Params p) {
        return (Math.pow(p.a,2));
    }
    @Override
    public double getPerimeter(Params p) {
        return ((p.a*4));
    }

}

class Rectangle extends Quadrangle {
    @Override
    public String getFigureName() {
        return ("Прямоугольник");
    }
    @Override
    public double getPerimeter(Params p) {
        return ((p.a*2+p.b*2));
    }
    @Override
    public double getSquare(Params p) {
        return (p.a*p.b);
    }
}

public class CW3_2 {
    public static void main(String[] args) {
        Params p = new Params(3,5,4);
        Ffigure figure1 = new Circlle();
        figure1.show(p);

        Ffigure figure2 = new Rectangle();
        figure2.show(p);

        Ffigure figure3 = new Square();
        figure3.show(p);

    }
}
