package com.company;

public class InfoLogger extends AbstractLogger{

    protected InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void display(int level, String message, LogSubject logSubject) {
        System.out.println("INFO level " + message);
        logSubject.notifyAllObservers(level,message);

    }
}
