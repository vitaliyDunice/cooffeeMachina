package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Profile {
    String name;
    int milk;
    int coffee;
    int water;

    public Profile(String name, int milk, int coffee, int water) {
        this.name = name;
        this.milk = milk;
        this.coffee = coffee;
        this.water = water;
    }
    public static class menu4 {
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
                    scan.nextLine(); // Очищаем буфер ввода после считывания числа
                    if (value >= min && value <= max) {
                        return value;
                    } else {
                        System.out.println("Некорректное значение, попробуйте снова.");
                    }
                } else {
                    System.out.println("Ошибка: введите корректное числовое значение.");
                    scan.next(); // Очищаем некорректный ввод
                }
            }
        }
    }
}

















































    /*if (name.isEmpty()) {
        System.out.println("невозможно создать профиль");
        return;
    } else {
        for (var profile : profiles) {
            if (name.equals(profile.profileName)) {
                System.out.println("невозможно создать профиль");
                return;
            } else {
                System.out.println("!!!помните, чтобы профиль работал, общая сумма кружек кофе не должна превышать 10!!!");
            }
        }
    }
    System.out.println("!!!помните, чтобы профиль работал, общая сумма кружек кофе не должна превышать 10!!!");
    System.out.println("Сколько приготовить капучино: ");
    count_cup = in4.nextInt();
    System.out.println("Сколько приготовить эспрессо: ");
    count_esp = in4.nextInt();
    if (count_esp + count_cup > 10) {
        System.out.println("невозможно создать профиль");
    } else {
        profiles.add(new Profiles(name, count_cup, count_esp));
    }
}

/*private static void showProfiles() {
    System.out.println("существующие профили:\n");
    for (var profile : profiles) {
        System.out.printf("имя профиля: %s;количество капучино: %d; количество эспрессо: %d\n", profile.profileName, profile.countCappuccino, profile.countEsspresso);

    }
}

public static void makeByProfile() {
    Scanner in5 = new Scanner(System.in);
    if (profiles.isEmpty()) {
        System.out.println("профилей нема");
        return;
    } else {
        showProfiles();
    }
    System.out.println("Введите название профиля: ");

    String choice_profile = in5.nextLine();

    for (var profile : profiles) {
        if (choice_profile.equals(profile.profileName)) {
            if (water < (Esspresso.waterAmount * profile.countEsspresso) + (Cappuccino.waterAmount * profile.countCappuccino)
                    || coffee < (Esspresso.coffeeAmount * profile.countEsspresso) + (Cappuccino.coffeeAmount * profile.countCappuccino)
                    || milk < (Esspresso.milkAmount * profile.countEsspresso) + (Cappuccino.milkAmount * profile.countCappuccino) || depravity * (profile.countEsspresso + profile.countCappuccino) > 99) {
                System.out.println("невозможно сделать профиль");
            } else {
                makeCoffee(Cappuccino.waterAmount, Cappuccino.coffeeAmount, Cappuccino.milkAmount, Cappuccino.coffeeName, profile.countCappuccino);
                makeCoffee(Esspresso.waterAmount, Esspresso.coffeeAmount, Esspresso.milkAmount, Esspresso.coffeeName, profile.countEsspresso);
                int n = profile.countCappuccino + profile.countEsspresso;
                log.add("кофе по профилю приготовлено " + n + " раз");
            }
            return;
        }
    }*/

