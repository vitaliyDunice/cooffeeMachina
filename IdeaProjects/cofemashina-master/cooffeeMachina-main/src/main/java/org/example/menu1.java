package org.example;

import java.util.Scanner;
public class menu1 {
    public static void nam1() {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        System.out.println("-------------------------------------------");
        System.out.println("1 - Capuchino ");
        System.out.println("2 - Espresso ");
        System.out.println("-------------------------------------------");
        byte in = scan.nextByte();
        System.out.println("-------------------------------------------");
        System.out.println("Скоько чашек? Максимум 5: ");
        System.out.println("-------------------------------------------");
        byte con = scan.nextByte();
        if (con > 5 | con < 1){
            System.out.println("-------------------------------------------");
            System.out.println("Неверное значение");
            System.out.println("-------------------------------------------");
            nam1();
        }
        switch (in) {
            case 1:
                cofemacgina.water += Capuchino.waterRashod * con;
                cofemacgina.coffee += Capuchino.coffeeRashod * con;
                cofemacgina.milk += Capuchino.milkRashod * con;
                cofemacgina.pollution += i * con;
                System.out.println("-------------------------------------------");
                System.out.println("Ваше " + con + " Capuchino готов!");
                System.out.println("-------------------------------------------");
                cofemacgina.mainMenu();
                break;
            case 2:
                cofemacgina.water += Espresso.waterRashod * con;
                cofemacgina.coffee += Espresso.coffeeRashod * con;
                cofemacgina.milk += Espresso.milkRashod * con;
                cofemacgina.pollution += i * con;
                System.out.println("-------------------------------------------");
                System.out.println("Ваше " + con + " Espresso готов!");
                System.out.println("-------------------------------------------");
                System.out.println("Ведите любую цифру для возврата в меню.");
                System.out.println("-------------------------------------------");
                scan.nextInt();
                cofemacgina.mainMenu();
                break;
            default:
                System.out.println("-------------------------------------------");
                System.out.println("Вы сделали что не то!");
                System.out.println("-------------------------------------------");
                break;
        }
    }
}
