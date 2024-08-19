package org.example;

import java.util.List;

import static org.example.cofemacgina.mainMenu;

public class menu6 {
    public static void nam6() {
        List<String> logs = cofemacgina.getLogMessages();
        for (String log : logs) {
            System.out.println(log);
            mainMenu();
        }
    }
}
