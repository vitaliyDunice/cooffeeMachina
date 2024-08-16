package methods;

import classes.Cappuccino;
import classes.Esspresso;
import classes.Profiles;

import java.util.ArrayList;
import java.util.Scanner;

import static classes.Ingridients.*;


public class Coffemachine {
    public static void mainMenu() {
        System.out.println("\nฅ^•ﻌ•^ฅ КОФЕМАШИНКА ฅ^•ﻌ•^ฅ");
        System.out.println("'0' === выключить");
        System.out.println("'1' === приготовить кофу");
        System.out.println("'2' === заглянуть внутрь");
        System.out.println("'3' === fill me daddy");
        System.out.println("'4' === искупать грязную шлюшку");
        System.out.println("'5' === создать профиля");
        System.out.println("'6' === использовать профиля");
        System.out.println("'7' === рецепты кофа");
        System.out.println("'8' === логи");
        System.out.print("( ͡° ͜ʖ ͡°)пиши: ");
    }

    public static void makeCoffeeInMenu() {
        Scanner in1 = new Scanner(System.in);
        System.out.println("'0' === капучино");
        System.out.println("'1' === экспрессо");
        System.out.println("чтобы выйти, наберите любой символ");
        String cofenum = in1.nextLine();
        switch (cofenum) {
            case "0":
                System.out.println("Сколько раз(максимум 10)?");
                int inputCappuccino = in1.nextInt();
                makeCoffee(Cappuccino.waterAmount,
                        Cappuccino.coffeeAmount,
                        Cappuccino.milkAmount,
                        Cappuccino.coffeeName,
                        inputCappuccino);
                break;
            case "1":
                System.out.println("Сколько раз(максимум 10)?");
                int inputEsspresso = in1.nextInt();
                makeCoffee(Esspresso.waterAmount,
                        Esspresso.coffeeAmount,
                        Esspresso.milkAmount,
                        Esspresso.coffeeName,
                        inputEsspresso);
                break;
            default:
                break;
        }
    }

    static void makeCoffee(int amountWater, int amountCoffee, int amountMilk, String profileName, int inputCount) {
        if (((water) < (amountWater * inputCount))
                || ((coffee) < (amountCoffee * inputCount))
                || ((milk) < (amountMilk * inputCount))
                || ((10 * inputCount) + depravity > 100
                || inputCount > 10))
            System.out.println("невозможно приготовить, проверьте внутренности");
        else {
            int i = 0;
            while (i < inputCount) {
                water -= amountWater;
                coffee -= amountCoffee;
                milk -= amountMilk;
                depravity += 10;
                System.out.printf("%s  готово\n", profileName);
                i++;
            }
        }
        log.add(profileName + " приготовлено " + inputCount + " раз");
    }

    public static void addAll() {
        coffee = 2000;
        milk = 2000;
        water = 2000;

        System.out.println("я заполнена");
        log.add("машина заполнена");
    }

    public static void pool() {
        depravity = 0;
        System.out.println("*выходит из душа*");
        log.add("машина очищена");
    }

    public static void show() {
        Scanner in1 = new Scanner(System.in);
        System.out.println("\n'0' === состав капучино");
        System.out.println("'1' === состав экспрессо");
        System.out.println("чтобы выйти, наберите любой символ");
        String ingnum = in1.nextLine();
        switch (ingnum) {
            case "0":
                System.out.printf("Водичка: %dмл\nМолочко: %dмл\nкофе: %dг\n", Cappuccino.waterAmount, Cappuccino.milkAmount, Cappuccino.coffeeAmount);
                break;
            case "1":
                System.out.printf("Водичка: %dмл\nМолочко: %dмл\nкофе: %dг\n", Esspresso.waterAmount, Esspresso.milkAmount, Esspresso.coffeeAmount);
                break;
            default:
                break;
        }
    }

    static ArrayList<String> log = new ArrayList<>();

    public static void logOut() {
        for (String i : log) {
            System.out.println(i);
        }
    }

    private static ArrayList<Profiles> profiles = new ArrayList<>();

    public static void makeProfile() {
        Scanner in4 = new Scanner(System.in);
        System.out.println("Введите название профиля: ");
        String name;
        int count_cup;
        int count_esp;
        name = in4.nextLine();
        if (name.isEmpty()) {
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

    private static void showProfiles() {
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
        }
    }
}


