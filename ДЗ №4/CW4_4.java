package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CW4_4 {
    public static void main(String[] args) {
        Map<String, Integer> consoles = new HashMap<String, Integer>();
        consoles.put("Sony PlayStation 4", 500);
        consoles.put("Sony PlayStation 5", 1000);
        consoles.put("Xbox 360", 300);
        consoles.put("Xbox One", 1100);

        for (Object key : consoles.keySet()) {
            System.out.println(key + " - " + consoles.get(key));
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название ключа, содержащегося в карте(Sony PlayStation 4, Sony PlayStation 5,Xbox 360,Xbox One)");
        String console = sc.nextLine();

        if (consoles.containsKey(console)) {
            System.out.println(console + " стоит " + consoles.get(console) + " $");
        } else {
            System.out.println("К сожалению такой консоли нет в продаже");
        }

        System.out.println("Введите цену, за которую хотите приобрести консоль(300,500,1000,1100): ");
        String str = sc.nextLine();
        Integer price = Integer.parseInt(str);
        if ( consoles.containsValue(price)) {
            for (Map.Entry e :  consoles.entrySet()) {
                if (e.getValue() == price) {
                    System.out.println("За " + price + " $" + " вы можете приобрести " + e.getKey());
                }
            }
        } else {
            System.out.println("Консоли за такую цену нет, но вы могли бы приобрести другую");
        }




    }
}

