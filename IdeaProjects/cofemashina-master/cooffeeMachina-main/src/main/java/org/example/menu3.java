package org.example;

import java.util.Scanner;

import static org.example.cofemacgina.mainMenu;

public class menu3  {
    public static void nam3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("        Включить функцию     ");
        System.out.println(" 1 - Автоматическа очистка кофемашины ");
        System.out.println(" 2 - Пополнить бак с  кофе ");
        System.out.println(" 3 - Пополнить бак с молоком ");
        System.out.println(" 4 - Пополнить бак с  водой ");
        System.out.println(" 5 - Выполнить всё в автоматическом режиме  ");
        System.out.println(" 6 - Вернуться в главное меню  ");
        System.out.println("-------------------------------------------");
        System.out.println("Введите значение: ");

        byte van = scan.nextByte();
        switch (van) {
            case 1:
                if (cofemacgina.pollution == 0){
                    System.out.println("-------------------------------------------");
                    System.out.println("Машина не требует чистки!");
                    System.out.println("-------------------------------------------");
                    nam3();
                } else{
                cofemacgina.pollution = 0;
                System.out.println("-------------------------------------------");
                System.out.println("Машина очищена!");
                System.out.println("-------------------------------------------");
                nam3();
                break;}
            case 2:
                if (cofemacgina.coffee == 0){
                    System.out.println("-------------------------------------------");
                    System.out.println("Бак полон!");
                    System.out.println("-------------------------------------------");
                    nam3();
                } else {
                cofemacgina.coffee = 0;
                System.out.println("-------------------------------------------");
                System.out.println("Кофе пополнено!");
                System.out.println("-------------------------------------------");
                nam3();}
                break;
            case 3:
                if (cofemacgina.milk == 0){
                    System.out.println("-------------------------------------------");
                    System.out.println("Бак полон!");
                    System.out.println("-------------------------------------------");
                    nam3();
                }else {
                cofemacgina.milk = 0;
                System.out.println("-------------------------------------------");
                System.out.println("Молоко пополнено!");
                System.out.println("-------------------------------------------");
                nam3();}
                break;
            case 4:
                if (cofemacgina.water == 0){
                    System.out.println("-------------------------------------------");
                    System.out.println("Бак полон!");
                    System.out.println("-------------------------------------------");
                    nam3();
                }else {
                cofemacgina.water = 0;
                System.out.println("-------------------------------------------");
                System.out.println("Вода пополнена!");
                System.out.println("-------------------------------------------");
                nam3();}
                break;
            case 5:
                if ((cofemacgina.milk == 0) | (cofemacgina.water == 0) | (cofemacgina.coffee == 0) | (cofemacgina.pollution == 0)){
            System.out.println("-------------------------------------------");
            System.out.println("Пополнение не нужно!");
            System.out.println("-------------------------------------------");
            mainMenu();
                }
                else {

                    cofemacgina.pollution = 0;
                    cofemacgina.coffee = 0;
                    cofemacgina.milk = 0;
                    cofemacgina.water = 0;
                    System.out.println("-------------------------------------------");
                    System.out.println("Пополнение выполнено!");
                    System.out.println("-------------------------------------------");
                    mainMenu();
                }
            case 6:
                mainMenu();
                break;
        }
        }
    }