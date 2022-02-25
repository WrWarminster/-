package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CW4_3 {
    public static void main(String[] args) {
        Queue<Character> qc = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите случайное кол-во различных символов:");
        String str = sc.nextLine();
        for (char c : str.toCharArray())
            qc.offer(c);
        while (qc.peek() != null) {
            System.out.print(qc.poll() + " ");
        }

    }
}
