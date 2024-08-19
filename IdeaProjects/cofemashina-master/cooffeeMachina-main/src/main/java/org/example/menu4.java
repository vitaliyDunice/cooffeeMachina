package org.example;


import java.util.Scanner;
import java.util.HashMap;

import static org.example.cofemacgina.mainMenu;

class Profile {
    String name;
    int milk;
    int coffee;
    int water;

    public Profile(int milk, int coffee, int water) {
        this.milk = milk;
        this.coffee = coffee;
        this.water = water;
    }

public class menu4 {
    public static HashMap<String, Profile> profiles = new HashMap<>();
    public static HashMap<String, Profile> getProfiles() {
        return profiles;
    }
    public static void nam4() {
        Scanner scan = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("-------------------------------------------");
            System.out.println("Введите название профиля: ");
            System.out.println("-------------------------------------------");
            String name = scan.nextLine();

            System.out.println("-------------------------------------------");
            System.out.println("Введите количество молока: ");
            System.out.println("-------------------------------------------");
            int milk = scan.nextInt();
            if (milk > 200 || milk <= 0){
                System.out.println("-------------------------------------------");
                System.out.println("Неккоректное значение");
                menu4.nam4();}

            System.out.println("-------------------------------------------");
            System.out.println("Введите количество кофе: ");
            System.out.println("-------------------------------------------");
            int coffee = scan.nextInt();
            if (coffee > 5 || coffee <= 0){
                System.out.println("-------------------------------------------");
                System.out.println("Неккоректное значение");
                menu4.nam4();}

            System.out.println("-------------------------------------------");
            System.out.println("Введите количество воды: ");
            System.out.println("-------------------------------------------");
            int water = scan.nextInt();
            if (water > 200 || water <= 0 ){
                System.out.println("-------------------------------------------");
                System.out.println("Неккоректное значение");
                menu4.nam4();}

            scan.nextLine();
            Profile profile = new Profile(milk, coffee, water);
            profiles.put(name, profile);
            System.out.println("-------------------------------------------");
            System.out.println("Профиль создан. ");
            System.out.println("-------------------------------------------");
            mainMenu();
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

