package com.company;

public class ErrorLogger extends AbstractLogger{

    protected ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void display(int level, String message, LogSubject logSubject) {
        System.out.println("ERROR level " + message);
        logSubject.notifyAllObservers(level,message);
    }
}
