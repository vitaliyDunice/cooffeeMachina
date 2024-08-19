package org.example;
import java.util.Scanner;

import static org.example.cofemacgina.mainMenu;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Нажмите любую кнопку, чтобы включить кофемашину:");
        System.out.println("-------------------------------------------");
        scan.nextLine();
        mainMenu();
    }
}
