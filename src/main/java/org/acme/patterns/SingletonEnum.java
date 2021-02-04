package org.acme.patterns;

public enum SingletonEnum {
    INSTANCE;

    private final String message = "enum";

    public String getMessage() {
        return message;
    }
}
