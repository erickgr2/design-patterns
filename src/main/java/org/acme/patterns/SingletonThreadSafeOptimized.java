package org.acme.patterns;

public class SingletonThreadSafeOptimized {

    private static volatile SingletonThreadSafeOptimized instance = null;

    private final String message = "thread-safe-optimized";

    private SingletonThreadSafeOptimized() {
    }

    public static SingletonThreadSafeOptimized getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafeOptimized.class){
                if(instance == null) {
                    instance =  new SingletonThreadSafeOptimized();
                }
            }
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }
}
