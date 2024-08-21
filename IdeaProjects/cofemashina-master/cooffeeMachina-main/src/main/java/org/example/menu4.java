package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class menu4 {
    private static final Map<String, Profile> profiles = new HashMap<>();
    private static final Scanner scan = new Scanner(System.in);

    public static Map<String, Profile> getProfiles() {
        return profiles;
    }
    public static void nam4() {
        String name;
        int milk;
        int coffee;
        int water;

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("Введите название профиля: ");
            System.out.println("-------------------------------------------");
            name = scan.nextLine().trim();
            if (!name.isEmpty()) {
                break;
            }
            System.out.println("Ошибка: название профиля не должно быть пустым или состоять только из пробелов. Попробуйте снова.");
        }

        milk = getValidInt("Введите количество молока: макс 200мл ", -1, 200);
        coffee = getValidInt("Введите количество кофе: макс 5г ", 1, 5);
        water = getValidInt("Введите количество воды: мин 50 макс 200мл ", 50, 200);
        Profile profile = new Profile(name, milk, coffee, water);
        profiles.put(name, profile);

        System.out.println("-------------------------------------------");
        System.out.println("Профиль создан.");
        System.out.println("-------------------------------------------");
        cofemacgina.mainMenu();
    }

    private static int getValidInt(String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println(prompt);
            System.out.println("-------------------------------------------");
            if (scan.hasNextInt()) {
                value = scan.nextInt();
                scan.nextLine();
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("Некорректное значение, попробуйте снова.");
                }
            } else {
                System.out.println("Ошибка: введите корректное числовое значение.");
                scan.next();
            }
        }
    }
}


