package com.company;


public class LogManager {

    public static AbstractLogger buildChainOfLoggers(){

        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger debugLogger = new DebugLogger(2);
        AbstractLogger errorLogger =  new ErrorLogger(3);

        infoLogger.setNextLoggingLevel(debugLogger);
        debugLogger.setNextLoggingLevel(errorLogger);

        return infoLogger;
    }

    public static LogSubject buildLoggerObserver(){
        LogSubject loggerSubject = new LogSubject();
        ConsoleObsever consoleLogger = new ConsoleObsever();
        FileObserver fileObserver = new FileObserver();
        DatabaseObserber databaseObserber = new DatabaseObserber();
        loggerSubject.addLogObserver(1,consoleLogger);
        loggerSubject.addLogObserver(2,consoleLogger);
        loggerSubject.addLogObserver(2,fileObserver);
        loggerSubject.addLogObserver(3,databaseObserber);
        return loggerSubject;

    }
}
