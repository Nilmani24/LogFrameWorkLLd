package com.company;

public class ConsoleObsever implements LogObserver{
    @Override
    public void log(String message) {
        System.out.println("CONSOLE " + message);
    }
}
