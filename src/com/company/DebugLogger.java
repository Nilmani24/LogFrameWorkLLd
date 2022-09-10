package com.company;

public class DebugLogger extends AbstractLogger{

    protected DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void display(int level, String message, LogSubject logSubject) {
        System.out.println("DEBUG level " + message);
        logSubject.notifyAllObservers(level,message);
    }
}
