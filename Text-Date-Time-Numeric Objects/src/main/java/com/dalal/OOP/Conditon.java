package com.dalal.OOP;

public enum Conditon {
    HOT("warnig"),
    COLD("it's cold");

    private String message;

    Conditon(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
