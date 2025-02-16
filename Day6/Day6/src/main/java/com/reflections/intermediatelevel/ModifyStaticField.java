package com.reflections.intermediatelevel;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "ORIGINAL_KEY";

    public static void printKey() {
        System.out.println("API_KEY: " + API_KEY);
    }
}

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        // Get the Class object
        Class<?> configClass = Configuration.class;

        // Get the private static field
        Field apiKeyField = configClass.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);

        // Modify the static field
        apiKeyField.set(null, "NEW_SECRET_KEY");

        // Print updated value
        Configuration.printKey();
    }
}
