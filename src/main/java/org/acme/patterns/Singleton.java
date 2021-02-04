package org.acme.patterns;

public class Singleton {

    private static Singleton instance = null;

    private final String message = "lazy";

    private Singleton () {
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }

}
