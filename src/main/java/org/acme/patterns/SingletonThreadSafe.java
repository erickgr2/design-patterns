package org.acme.patterns;

public class SingletonThreadSafe {

    private static SingletonThreadSafe instance = null;

    private final String message = "thread-safe";

    private SingletonThreadSafe () {
    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null){
            instance = new SingletonThreadSafe();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }

}
