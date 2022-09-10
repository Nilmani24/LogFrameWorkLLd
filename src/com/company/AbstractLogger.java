package com.company;

public abstract class AbstractLogger {
    protected int level ;
    private  AbstractLogger nextLevelLogger;

    public void setNextLoggingLevel(AbstractLogger nextLevelLogger){
        this.nextLevelLogger = nextLevelLogger;
    }

    protected void logMessage(int level ,String message , LogSubject logSubject){
        if(this.level == level){
            display(level,message,logSubject);
        }
        if(nextLevelLogger != null){
            nextLevelLogger.logMessage(level,message,logSubject);
        }
    }


    protected abstract void display(int level, String message, LogSubject logSubject);
}
