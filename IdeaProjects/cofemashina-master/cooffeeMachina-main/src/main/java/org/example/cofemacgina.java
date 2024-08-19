package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cofemacgina {
    private static final List<String> logMessages = new ArrayList<>();
    public static int coffee;
    public static int maxCoffee = 150;
    public static int milk;
    public static int maxMilk = 2500;
    public static int water;
    public static int maxWater = 3000;
    public static int pollution;
    public static int maxPollution = 150;

    private static void log(String message) {
        logMessages.add(message);
    }

    public static List<String> getLogMessages() {
        return new ArrayList<>(logMessages);
    }

    public static void mainMenu() {

        Scanner scan = new Scanner(System.in);
        log("Открыто главное меню.");
        byte van = -1;
        while (van < 0 || van > 6) {
            System.out.println("-------------------------------------------");
            System.out.println("1 - Выбрать готовый вариант ");
            System.out.println("2 - Проверить наличие ингредиентов ");
            System.out.println("3 - Пополнить ингредиенты ");
            System.out.println("4 - Создать свой вариант ");
            System.out.println("5 - Выбрать свой вариант ");
            System.out.println("6 - Посмотреть логи ");
            System.out.println("0 - Выключить ");
            System.out.println("Что выберете?: ");
            System.out.println("-------------------------------------------");
            try {
                van = scan.nextByte();
                if (van < 0 || van > 6) {
                    log("Ошибка ввода: ");
                    System.out.println("Выберите значение от 0 до 6.");
                }
                if (van == ' '){
                    log("Ошибка ввода: ");
                    System.out.println("Выберите значение от 0 до 6.");
                }
            } catch (Exception e) {
                log("Ошибка ввода: ");
                System.out.println("Введите корректное число от 0 до 6.");
                scan.next();
            }
        }
        switch (van) {
            case 1:
                log("Попытка выбрать готовый вариант.");
                if (cofemacgina.coffee < 120) {
                    log("Недостаточно кофе.");
                    System.out.println("-------------------------------------------");
                    System.out.println("Что-то пошло не так! Пополните бак с кофе!");
                    System.out.println("-------------------------------------------");
                    menu3.nam3();
                }
                if (cofemacgina.milk < 1900) {
                    log("Недостаточно молока.");
                    System.out.println("-------------------------------------------");
                    System.out.println("Что-то пошло не так! Пополните бак с молоком!");
                    System.out.println("-------------------------------------------");
                    menu3.nam3();
                }
                if (cofemacgina.water < 2000) {
                    log("Недостаточно воды.");
                    System.out.println("-------------------------------------------");
                    System.out.println("Что-то пошло не так! Пополните бак с водой!");
                    System.out.println("-------------------------------------------");
                    menu3.nam3();
                }
                if (cofemacgina.pollution > 140) {
                    log("Необходимо очистить кофемашину.");
                    System.out.println("-------------------------------------------");
                    System.out.println("Что-то пошло не так! Очистите кофемашину!");
                    System.out.println("-------------------------------------------");
                    menu3.nam3();
                } else {
                    log("Приготовление напитка.");
                    menu1.nam1();
                }
                break;
            case 2:
                log("Проверка наличия ингредиентов.");
                menu2.nam2();
                break;
            case 3:
                log("Пополнение ингредиентов.");
                menu3.nam3();
                break;
            case 4:
                log("Создание собственного варианта.");
                Profile.menu4.nam4();
                break;
            case 5:
                log("Выбор собственного варианта.");
                if (cofemacgina.coffee < 120) {
                    log("Недостаточно кофе.");
                    System.out.println("-------------------------------------------");
                    System.out.println("Что-то пошло не так! Пополните бак с кофе!");
                    System.out.println("-------------------------------------------");
                    menu3.nam3();
                }
                if (cofemacgina.milk < 1900) {
                    log("Недостаточно молока.");
                    System.out.println("-------------------------------------------");
                    System.out.println("Что-то пошло не так! Пополните бак с молоком!");
                    System.out.println("-------------------------------------------");
                    menu3.nam3();
                }
                if (cofemacgina.water < 2000) {
                    log("Недостаточно воды.");
                    System.out.println("-------------------------------------------");
                    System.out.println("Что-то пошло не так! Пополните бак с водой!");
                    System.out.println("-------------------------------------------");
                    menu3.nam3();
                }
                if (cofemacgina.pollution > 140) {
                    log("Необходимо очистить кофемашину.");
                    System.out.println("-------------------------------------------");
                    System.out.println("Что-то пошло не так! Очистите кофемашину!");
                    System.out.println("-------------------------------------------");
                    menu3.nam3();
                } else {
                    log("Приготовление своегонапитка.");
                    menu5.nam5();
                    break;
                }case 6:
                log("Выбор просмотр логов.");
                menu6.nam6();
                break;
            case 0:
                log("Выключение кофемашины.");
                System.out.println("Кофемашина выключена.");
                break;
        }
        scan.close();
    }
}

