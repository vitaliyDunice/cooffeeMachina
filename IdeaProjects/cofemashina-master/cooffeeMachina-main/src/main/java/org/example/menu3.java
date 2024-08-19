package org.example;

import java.util.Scanner;

import static org.example.cofemacgina.mainMenu;

public class menu3 {
    public static void nam3() {
        Scanner scan = new Scanner(System.in);
        byte van = -1;

        while (van < 1 || van > 6) {
            System.out.println("-------------------------------------------");
            System.out.println("        Включить функцию     ");
            System.out.println(" 1 - Автоматическая очистка кофемашины ");
            System.out.println(" 2 - Пополнить бак с кофе ");
            System.out.println(" 3 - Пополнить бак с молоком ");
            System.out.println(" 4 - Пополнить бак с водой ");
            System.out.println(" 5 - Выполнить всё в автоматическом режиме ");
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
                if (cofemacgina.pollution == 0) {
                    logi.log("Машина не требует чистки!");
                    System.out.println("-------------------------------------------");
                    System.out.println("Машина не требует чистки!");
                    System.out.println("-------------------------------------------");
                } else {
                    logi.log("Машина очищена!");
                    cofemacgina.pollution = 0;
                    System.out.println("-------------------------------------------");
                    System.out.println("Машина очищена!");
                    System.out.println("-------------------------------------------");
                }
                break;
            case 2:
                if (cofemacgina.coffee == 0) {
                    logi.log("Бак полон!");
                    System.out.println("-------------------------------------------");
                    System.out.println("Бак полон!");
                    System.out.println("-------------------------------------------");
                } else {
                    logi.log("Кофе пополнено!");
                    cofemacgina.coffee = 0;
                    System.out.println("-------------------------------------------");
                    System.out.println("Кофе пополнено!");
                    System.out.println("-------------------------------------------");
                }
                break;
            case 3:
                if (cofemacgina.milk == 0) {
                    logi.log("Бак полон!");
                    System.out.println("-------------------------------------------");
                    System.out.println("Бак полон!");
                    System.out.println("-------------------------------------------");
                } else {
                    logi.log("Молоко пополнено!");
                    cofemacgina.milk = 0;
                    System.out.println("-------------------------------------------");
                    System.out.println("Молоко пополнено!");
                    System.out.println("-------------------------------------------");
                }
                break;
            case 4:
                if (cofemacgina.water == 0) {
                    logi.log("Бак полон!");
                    System.out.println("-------------------------------------------");
                    System.out.println("Бак полон!");
                    System.out.println("-------------------------------------------");
                } else {
                    logi.log("Вода пополнена!");
                    cofemacgina.water = 0;
                    System.out.println("-------------------------------------------");
                    System.out.println("Вода пополнена!");
                    System.out.println("-------------------------------------------");
                }
                break;
            case 5:
                if (cofemacgina.pollution == 0 && cofemacgina.coffee == 0 && cofemacgina.milk == 0 && cofemacgina.water == 0) {
                    logi.log("Пополнение не нужно!");
                    System.out.println("-------------------------------------------");
                    System.out.println("Пополнение не нужно!");
                    System.out.println("-------------------------------------------");
                } else {
                    logi.log("Пополнение выполнено!");
                    cofemacgina.pollution = 0;
                    cofemacgina.coffee = 0;
                    cofemacgina.milk = 0;
                    cofemacgina.water = 0;
                    System.out.println("-------------------------------------------");
                    System.out.println("Пополнение выполнено!");
                    System.out.println("-------------------------------------------");
                }
                break;
            case 6:
                logi.log("Возврат в меню!");
                mainMenu();
                return;
        }
        nam3();
    }
}
