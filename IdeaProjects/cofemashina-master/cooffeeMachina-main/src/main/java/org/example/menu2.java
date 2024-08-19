package org.example;

import java.util.HashMap;
import java.util.Scanner;

import static org.example.cofemacgina.mainMenu;

public class menu2 {
    public static void nam2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println(" 1 - Проверить загрязнение ");
        System.out.println(" 2 - Проверить наличие кофе ");
        System.out.println(" 3 - Проверить наличие молока ");
        System.out.println(" 4 - Проверить наличие воды ");
        System.out.println(" 5 - Проверить все ");
        System.out.println(" 6 - Вернуться в главное меню  ");
        System.out.println("-------------------------------------------");
        System.out.println("Введите значение: ");
        byte van = scan.nextByte();
            if  (van > 5 | van < 1){
                System.out.println("-------------------------------------------");
                System.out.println("Неверное значение");
                System.out.println("-------------------------------------------");
        }
        switch (van) {
            case 1:
                System.out.println("-------------------------------------------");
                System.out.println("Загрязнено на " + cofemacgina.pollution + " из " + cofemacgina.maxPollution);
                System.out.println("-------------------------------------------");
                nam2();
                break;
            case 2:
                System.out.println("-------------------------------------------");
                System.out.println("Затрачено " +cofemacgina.coffee + " из " + cofemacgina.maxCoffee);
                System.out.println("-------------------------------------------");
                nam2();
                break;
            case 3:
                System.out.println("-------------------------------------------");
                System.out.println("Затрачено " + cofemacgina.milk + " из " + cofemacgina.maxMilk);
                System.out.println("-------------------------------------------");
                nam2();
                break;
            case 4:
                System.out.println("-------------------------------------------");
                System.out.println("Затрачено " + cofemacgina.water + " из " + cofemacgina.maxWater);
                System.out.println("-------------------------------------------");
                nam2();
                break;
            case 5:
                System.out.println("-------------------------------------------");
                System.out.println("Загрязнено на " + cofemacgina.pollution + " из " + cofemacgina.maxPollution);
                System.out.println("Затрачено " +cofemacgina.coffee + " из " + cofemacgina.maxCoffee);
                System.out.println("Затрачено " + cofemacgina.milk + " из " + cofemacgina.maxMilk);
                System.out.println("Затрачено " + cofemacgina.water + " из " + cofemacgina.maxWater);
                System.out.println("-------------------------------------------");
                nam2();
                break;
            case 6:
                mainMenu();
                break;
        }
    }
}