package com.company;

import java.io.Serializable;

public class Logger implements Cloneable, Serializable {
    private static Logger logger;
    private static AbstractLogger log;
    private static  LogSubject logSubject;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                    log = LogManager.buildChainOfLoggers();
                    logSubject = LogManager.buildLoggerObserver();
                }
            }
        }
        return logger;
    }

    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("it's singelton class");
    }

    protected Object readResolve() {
        return logger;
    }

    private void createLog(int level, String message) {
        log.logMessage(level, message, logSubject);
    }

    public void info(String message) {
        createLog(1, message);
    }

    public void debug(String message) {
        createLog(2, message);
    }

    public void error(String message) {
        createLog(3, message);
    }

}
