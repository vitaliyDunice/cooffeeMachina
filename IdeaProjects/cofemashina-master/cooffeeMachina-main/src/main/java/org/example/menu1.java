package org.example;

import java.util.Scanner;

public class menu1 {
    public static void nam1() {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        byte con = -1;
        byte in = -1;

        while (in < 1 || in > 2) {
            System.out.println("-------------------------------------------");
            System.out.println("1 - Capuchino ");
            System.out.println("2 - Espresso ");
            System.out.println("-------------------------------------------");
            try {
                String input = scan.nextLine();
                in = Byte.parseByte(input);

                if (in < 1 || in > 2) {
                    logi.log("Ошибка ввода: неверный выбор напитка.");
                    System.out.println("Выберите значение 1 или 2.");
                }
            } catch (NumberFormatException e) {
                logi.log("Ошибка ввода: некорректный ввод.");
                System.out.println("Введите корректное число (1 или 2).");
            }
        }

        while (con < 1 || con > 5) {
            System.out.println("-------------------------------------------");
            System.out.println("Сколько чашек? Максимум 5: ");
            System.out.println("-------------------------------------------");
            try {
                String input = scan.nextLine();
                con = Byte.parseByte(input);

                if (con < 1 || con > 5) {
                    logi.log("Ошибка ввода: неверное количество чашек.");
                    System.out.println("Выберите значение от 1 до 5.");
                }
            } catch (NumberFormatException e) {
                logi.log("Ошибка ввода: некорректное количество чашек.");
                System.out.println("Введите корректное число от 1 до 5.");
            }
        }

        switch (in) {
            case 1:
                logi.log("Приготовление Capuchino");
                cofemacgina.water += Capuchino.waterRashod * con;
                cofemacgina.coffee += Capuchino.coffeeRashod * con;
                cofemacgina.milk += Capuchino.milkRashod * con;
                cofemacgina.pollution += i * con;
                System.out.println("-------------------------------------------");
                System.out.println("Ваше " + con + " Capuchino готово!");
                System.out.println("-------------------------------------------");
                cofemacgina.mainMenu();
                break;
            case 2:
                logi.log("Приготовление Espresso");
                cofemacgina.water += Espresso.waterRashod * con;
                cofemacgina.coffee += Espresso.coffeeRashod * con;
                cofemacgina.milk += Espresso.milkRashod * con;
                cofemacgina.pollution += i * con;
                System.out.println("-------------------------------------------");
                System.out.println("Ваше " + con + " Espresso готово!");
                System.out.println("-------------------------------------------");
                cofemacgina.mainMenu();
                break;
            default:
                logi.log("Неизвестная ошибка.");
                System.out.println("-------------------------------------------");
                System.out.println("Что-то пошло не так!");
                System.out.println("-------------------------------------------");
                cofemacgina.mainMenu();
                break;
        }
    }
}
