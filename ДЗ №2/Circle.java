package com.company;

class Circle {
    private static int x;
    private static int y;
    private static int r;

    public static void print() {
            System.out.println("Координаты: X: " + x + "Y: " + y + "\nРадиус: " + r);
        }

        public void move() {
        }

        public static double distToOtherCircle() {
            double r = 2;
            return r;
        }

        public void changeRadius() {
        }

        public static double getPerimetr() {
            return 2 * (x + y);
        }

        public static double getSquare() {
            double r = 3;
            return r;
        }

        public Circle(int a, int b, int r) {
            this.x = a;
            this.y = b;
            this.r = r;
        }
}

class Main {
    public static void main(String[] args) {
    Circle c = null;
        System.out.println(c.distToOtherCircle());
        System.out.println(c.getPerimetr());
        System.out.println(c.getSquare());

    }
}



