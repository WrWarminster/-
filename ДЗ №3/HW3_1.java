package com.company;

interface ArithmeticOperations{
    default void add(SomeNumbers s){}
    default void subtract(SomeNumbers s){}
    default void multiply(SomeNumbers s){}
    default void divide(SomeNumbers s){}
}

class SomeNumbers {
    double a;
    double b;

    SomeNumbers (double a, double b) {
        this.a = a;
        this.b = b;
    }

}

class ComplexNum {

    int a; // действительная часть
    int b; // мнимая часть

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ComplexNum newComplexNum(int a, int b) {
        return new ComplexNum(a, b);
    }

    @Override
    public String toString() {
        return a + "+" + b + "i";
    }
}

class Numbers implements ArithmeticOperations {
    @Override
    public void add(SomeNumbers s) {
        System.out.println("Сложение = " + (s.a + s.b));
    }
    @Override
    public void subtract(SomeNumbers s) {
        System.out.println("Вычитание = " + (s.a - s.b));
    }
    @Override
    public void multiply(SomeNumbers s) {
        System.out.println("Умножение = " + (s.a * s.b));
    }
    @Override
    public void divide(SomeNumbers s) {
        System.out.println("Деление = " + (s.a / s.b));
    }
}

 class ComplexNumbers implements ArithmeticOperations {
     public void add(ComplexNum num1, ComplexNum num2) {
         ComplexNum cn = new ComplexNum(num1.a + num2.a, num1.b + num2.b);
         System.out.println("Cложение комплексных чисел = " + cn);
     }
     public void subtract(ComplexNum num1, ComplexNum num2) {
         ComplexNum cn = new ComplexNum(num1.a - num2.a, num1.b - num2.b);
         System.out.println("Вычитание комплексных чисел = " + cn);
     }
     public void multiply(ComplexNum num1, ComplexNum num2) {
         int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
         ComplexNum cn = new ComplexNum(a * c - b * d, b * c + a * d);
         System.out.println("Умножение комплексных чисел = " + cn);
     }
     public void divide(ComplexNum num1, ComplexNum num2) {
         int a = num1.a, b = num1.b, c = num2.a, d = num2.b;
         ComplexNum cn = new ComplexNum((a * c + b * d) / (c * c + d * d),
                 (b * c - a * d) / (c * c + d * d));
         System.out.println("Деление комплексных чисел = " + cn);
     }
}


public class HW3_1 {
    public static void main(String[] args) {
        SomeNumbers s = new SomeNumbers(4, 7);

        Numbers n = new Numbers();
        n.add(s);

        ComplexNum a = new ComplexNum(3, 2);
        ComplexNum b = new ComplexNum(2, 1);

        ComplexNumbers com = new ComplexNumbers();
        com.add(a, b);

    }
}
