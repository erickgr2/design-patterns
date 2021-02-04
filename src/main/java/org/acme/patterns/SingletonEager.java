package org.acme.patterns;

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private final String message = "eager";

    private SingletonEager () {
    }

    public static SingletonEager getInstance() {
        return instance;
    }

    public String getMessage() {
        return message;
    }

}
