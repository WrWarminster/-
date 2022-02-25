package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class CW4_5 {

    static <T> void printArray(T[] a) {
        for (T element : a) {
            System.out.print(element);
        }
    }
    static <T> void printCollection(Collection<T> c) {
        for (T element : c) {
            System.out.print(element);
        }
    }

    public static void main(String[] args) {
        Object[] strArr = new Object [] {"Эта ", "программа ", "написана ", "мной. "};
        Object[] strArr2 = new Object [] {1,2,3,4};

        Collection<Object> objColl = new ArrayList<>();
        objColl.add("Я ");
        objColl.add("очень ");
        objColl.add("старался. ");

        Collection<Object> objColl2 = new ArrayList<>();
        objColl.add("Я ");
        objColl.add("очень ");
        objColl.add("устал");

        printArray(strArr);
        printCollection(objColl);
        System.out.println();
        printArray(strArr2);
        printCollection(objColl2);
    }
}
