package com.reflections.advancedlevel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Step 1: Define an interface
interface Greeting {
    void sayHello(String name);
}

// Step 2: Implement the interface
class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

// Step 3: Create a Proxy Handler
class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Logging: Calling method " + method.getName());
        return method.invoke(target, args);
    }
}

public class ProxyExample {
    public static void main(String[] args) {
        Greeting original = new GreetingImpl();

        // Create a proxy instance
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxyHandler(original)
        );

        // Call method on proxy
        proxy.sayHello("Purvansh");
    }
}
