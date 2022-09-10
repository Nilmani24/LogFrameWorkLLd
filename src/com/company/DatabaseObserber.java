package com.company;

public class DatabaseObserber implements  LogObserver{
    @Override
    public void log(String message) {
        System.out.println("DATABASE " + message);
    }
}
