package org.example;

import java.util.Scanner;

import static classes.Ingridients.*;
import static classes.Ingridients.depravity;
import static methods.Coffemachine.*;
import static methods.Coffemachine.logOut;

public class Main {
    public static void main(String[] args) {
        boolean a = false;
        System.out.println("###Машина в спящем режиме###\n###чтобы включить, нажмите '1'###\n###чтобы выключить, любой другой символ###");
        Scanner in0 = new Scanner(System.in);
        String on = in0.nextLine();
        if (on.equals("1")) {
            a = true;
        } else {
            return;
        }
        while (a) {
            Scanner in = new Scanner(System.in);
            mainMenu();
            String command = in.nextLine();
            switch (command) {
                case "0":
                    a = false;
                    System.out.println("Усыпить машину");
                    break;
                case "1":
                    makeCoffeeInMenu();
                    break;
                case "2":
                    System.out.println("★=статистика=★");
                    System.out.printf("Водичка: %d/2000мл\nМолочко: %d/2000мл\nкофе: %d/2000г\nзагрязненность: %d%%\n", water, milk, coffee, depravity);
                    break;
                case "3":
                    addAll();
                    break;
                case "4":
                    pool();
                    break;
                case "5":
                    makeProfile();
                    break;
                case "6":
                    try {
                        makeByProfile();
                    } catch (Exception ex) {
                        System.out.println("неправильно набран профиль");
                        break;
                    }
                    break;
                case "7":
                    show();
                    break;
                case "8":
                    logOut();
                    break;
                default:
                    System.out.println("неверная команда");
            }
        }
    }


}