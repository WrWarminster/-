package com.company;

class Figure {
    private int a; //Длина
    private int b; //Ширина
    private int c; //Высота

    public int getLenght() {
        return a;
    }
    public void setLength(int a) {
       this.a = a;
    }
    public int getWidth() {
        return b;
    }
    public void setWidth(int b) {
        this.b = b;
    }
    public int getHeight() {
        return c;
    }
    public void setHeight(int c) {
        this.c = c;
    }


    Figure (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Volume(Figure obj) {
        int V = getLenght()*getWidth()*getHeight();
        System.out.println("Объём параллелепипеда = " + V);
    }
    public void Surface(Figure obj) {
        int S1 = getLenght()*getWidth();
        int S2 = getWidth()*getHeight();
        int S3 = getLenght()*getHeight();
        System.out.println("Площадь поверхности №1 = " + S1 + "\nПлощадь поверхности №2 = " + S2 + "\nПлощадь поверхности №3 = " + S3);

    }
    public static  void main(String[] args) {
        Figure figure = new Figure(1,2,4);
        figure.Volume(figure);
        figure.Surface(figure);

    }
}

