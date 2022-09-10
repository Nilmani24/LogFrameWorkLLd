package com.company;

public class FileObserver implements  LogObserver{
    @Override
    public void log(String message) {
        System.out.println("FILE OBSERBER "  + message);
    }
}
