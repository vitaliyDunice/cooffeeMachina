package org.example;

import java.util.Scanner;

public class menu5 {
    public static void nam5() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите название профиля: ");
        String name = scan.nextLine();

        Profile profile = Profile.menu4.getProfiles().get(name);

        if (profile != null) {
            cofemacgina.milk += profile.milk;
            cofemacgina.coffee += profile.coffee;
            cofemacgina.water += profile.water;
            cofemacgina.pollution ++;

            System.out.println("-------------------------------------------");
            System.out.println("Ваш " + name + " готов.");
            System.out.println("-------------------------------------------");
            cofemacgina.mainMenu();
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("Профиль с именем " + name + " не найден.");
            System.out.println("Создайте новый профиль!");
            System.out.println("-------------------------------------------");
            Profile.menu4.nam4();
        }
    }
}
