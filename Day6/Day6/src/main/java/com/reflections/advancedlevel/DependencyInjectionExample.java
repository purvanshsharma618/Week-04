package com.reflections.advancedlevel;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Step 1: Define @Inject annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

// Step 2: Define dependencies
class Service {
    public void perform() {
        System.out.println("Service is running...");
    }
}

// Step 3: Define class with dependencies
class Client {
    @Inject
    private Service service;

    public void execute() {
        service.perform();
    }
}

// Step 4: Implement Dependency Injection container
class DIContainer {
    public static void injectDependencies(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.set(obj, dependency);
            }
        }
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        DIContainer.injectDependencies(client);
        client.execute();
    }
}

