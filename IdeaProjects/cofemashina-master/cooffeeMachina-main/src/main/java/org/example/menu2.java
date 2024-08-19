package org.example;

import java.util.Scanner;

import static org.example.cofemacgina.mainMenu;

public class menu2 {
    public static void nam2() {
        Scanner scan = new Scanner(System.in);
        byte van = -1;

        while (van < 1 || van > 6) {
            System.out.println("-------------------------------------------");
            System.out.println(" 1 - Проверить загрязнение ");
            System.out.println(" 2 - Проверить наличие кофе ");
            System.out.println(" 3 - Проверить наличие молока ");
            System.out.println(" 4 - Проверить наличие воды ");
            System.out.println(" 5 - Проверить все ");
            System.out.println(" 6 - Вернуться в главное меню ");
            System.out.println("-------------------------------------------");
            System.out.println("Введите значение: ");

            try {
                String input = scan.nextLine();

                van = Byte.parseByte(input);

                if (van < 1 || van > 6) {
                    logi.log("Ошибка ввода.");
                    System.out.println("Введите значение от 1 до 6.");
                }
            } catch (NumberFormatException e) {
                logi.log("Ошибка ввода.");
                System.out.println("Введите корректное значение от 1 до 6.");
            }
        }

        switch (van) {
            case 1:
                logi.log("Проверка загрязнения");
                System.out.println("-------------------------------------------");
                System.out.println("Загрязнено на " + cofemacgina.pollution + " из " + cofemacgina.maxPollution);
                System.out.println("-------------------------------------------");
                break;
            case 2:
                logi.log("Наличие кофе.");
                System.out.println("-------------------------------------------");
                System.out.println("Затрачено " + cofemacgina.coffee + " из " + cofemacgina.maxCoffee);
                System.out.println("-------------------------------------------");
                break;
            case 3:
                logi.log("Наличие молока.");
                System.out.println("-------------------------------------------");
                System.out.println("Затрачено " + cofemacgina.milk + " из " + cofemacgina.maxMilk);
                System.out.println("-------------------------------------------");
                break;
            case 4:
                logi.log("Наличие воды.");
                System.out.println("-------------------------------------------");
                System.out.println("Затрачено " + cofemacgina.water + " из " + cofemacgina.maxWater);
                System.out.println("-------------------------------------------");
                break;
            case 5:
                logi.log("Проверка всего.");
                System.out.println("-------------------------------------------");
                System.out.println("Загрязнено на " + cofemacgina.pollution + " из " + cofemacgina.maxPollution);
                System.out.println("Затрачено " + cofemacgina.coffee + " из " + cofemacgina.maxCoffee);
                System.out.println("Затрачено " + cofemacgina.milk + " из " + cofemacgina.maxMilk);
                System.out.println("Затрачено " + cofemacgina.water + " из " + cofemacgina.maxWater);
                System.out.println("-------------------------------------------");
                break;
            case 6:
                logi.log("Возврат в меню");
                mainMenu();
                return;
        }
        nam2();
    }
}
