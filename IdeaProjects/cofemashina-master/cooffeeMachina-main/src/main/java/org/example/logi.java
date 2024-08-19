package org.example;

import java.util.ArrayList;
import java.util.List;

public class logi {
    private static List<String> logMessages = new ArrayList<>();
    static void log(String message) {
        logMessages.add(message);
    }
    public static List<String> getLogMessages() {
        return new ArrayList<>(logMessages);
    }
}