package com.company;

import java.io.*;
import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) throws IOException {
        String ans;
        ans = "y";
        StringBuilder builder = new StringBuilder();

        String path = "C:\\Users\\akm54\\IdeaProjects\\Tasks\\Test.txt";
        File f = new File(path);

        try {
            if (!f.createNewFile());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            BufferedReader in = new BufferedReader(new FileReader(f));
            try {
                String s = null;
                while ((s = in.readLine()) != null)
                    System.out.println(s);
            } finally {
                in.close();
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        while (!ans.equals("n")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку, которую желаете добавить: ");
            String text = sc.nextLine();
            builder.append(text);

            System.out.println("Чтобы продолжить, выберите y/n?");
            do {
                ans = sc.nextLine();
                if (ans.equals("y") == false && ans.equals("n") == false) {
                    System.out.println("Неверный запрос, чтобы продолжить, выберите y/n?");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);
        }

        FileWriter fileWriter = new FileWriter(f, true);
        fileWriter.write(String.valueOf(builder));
        fileWriter.close();
        System.out.println("Текст успешно записан!");
    }
}
