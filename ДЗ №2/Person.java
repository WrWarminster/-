package com.company;

public class Person {
    String name;
    int age;


    protected  void eat(){
        System.out.println("ест по утрам сметану");
    }

    protected  void sleep(){
        System.out.println("обязан лечь спать до 23:00");
    }

}
class Military extends Person {
    String post;
    int height;

    protected  void eat(){
        super.eat();
        System.out.println("солдаты едят только гречку");
    }

    protected void sleep(){
        super.sleep();
        System.out.println("эти солдаты ложаться раньше 10");
    }
}

class Soldiers extends Military {
    String title;

    protected void eat(){
        super.eat();
        System.out.println("эти солдаты не едят");
    }

    protected void sleep(){
        super.sleep();
        System.out.println("эти солдаты вообще не спят");
    }

}
